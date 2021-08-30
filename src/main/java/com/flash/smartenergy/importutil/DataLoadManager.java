package com.flash.smartenergy.importutil;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.District;
import com.flash.smartenergy.entity.State;
import com.flash.smartenergy.entity.test.User_Ext;
import com.flash.smartenergy.importutil.dto.GeoDataDTO;
import com.flash.smartenergy.repository.CountryRepository;
import com.flash.smartenergy.repository.DistrictRepository;
import com.flash.smartenergy.repository.JWTUserRepository;
import com.flash.smartenergy.repository.StateRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@NoArgsConstructor
@Service
public class DataLoadManager {

    @Autowired
    private JWTUserRepository userRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private DistrictRepository districtRepository;

    public void loadGeoDataFromFile(){
        List<User_Ext> users = Stream.of(
                new User_Ext("admin","admin","Admin"),
                new User_Ext("customer","test","Customer"),
                new User_Ext("eb","test","EB_Office")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to GeoDataDTO object
        try {
            GeoDataDTO geoData = objectMapper.readValue(new File("./src/main/resources/importfiles/states-and-districts.json"), GeoDataDTO.class);
            Arrays.stream(geoData.getCountries()).forEach((elt)->{
                Country country = new Country();
                country.setName(elt.getCountry());
                final Country countrySaved = countryRepository.save(country);
                Arrays.stream(elt.getStates()).forEach((stt)->{
                    State state = new State();
                    state.setName(stt.getState());
                    state.setCountry(countrySaved);
                    final State stateSaved = stateRepository.save(state);
                    Arrays.stream(stt.getDistricts()).forEach((dtt)->{
                        District district = new District();
                        district.setName(dtt);
                        district.setState(stateSaved);
                        District resp = districtRepository.save(district);
                        if(resp != null){
                            System.out.println("Success Load");
                        }else{
                            System.out.println("Load failed");
                        }
                    });
                });
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
