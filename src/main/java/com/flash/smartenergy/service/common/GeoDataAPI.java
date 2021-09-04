package com.flash.smartenergy.service.common;

import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.District;
import com.flash.smartenergy.entity.State;
import com.flash.smartenergy.entity.Zone;
import com.flash.smartenergy.repository.CountryRepository;
import com.flash.smartenergy.repository.DistrictRepository;
import com.flash.smartenergy.repository.StateRepository;
import com.flash.smartenergy.repository.ZoneRepository;
import com.flash.smartenergy.service.common.dto.GeoDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/geodata")
public class GeoDataAPI {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    StateRepository stateRepository;


    @Autowired
    ZoneRepository zoneRepository;

    @Autowired
    DistrictRepository districtRepository;


    @GetMapping("country/getAllCountries")
    public List<Country> getAllCoutries(){
        return countryRepository.findAll();
    }

    @PostMapping("country/getStatesByCountry")
    public List<State> getStatesByCountryName(@RequestBody String countryName) {
        /*public State[] getStatesByCountryName(@PathVariable("countryName")
                String countryName) */
        Country country = countryRepository.findByName(countryName);
        List<State> states = stateRepository.findByCountry(country);
        return states;
    }

    @PutMapping("country/addCountry")
    public Country addCountry(@RequestBody Country country){
        final Country response;
        if(validateCountry(country)){
            Country country1 = new Country();
            country1.setName(country.getName());
            response = countryRepository.save(country1);
            country.getStates().stream().forEach((elt)->{
                State state = new State();
                state.setName(elt.getName());
                state.setCountry(response);
                stateRepository.save(state);
            });
        }else{
            throw new RuntimeException("Country already exist in DB");
        }
        return response;
    }


    private boolean validateCountry(Country country){
        boolean isValid = false;
        if(Objects.nonNull(country)){
            isValid = ((!country.getName().isEmpty()) && (!checkCountryExist(country.getName())));
        }else{
            throw new RuntimeException("Request error");
        }
        return isValid;
    }

    private boolean checkCountryExist(String name){
        boolean isExist = false;
        Country country = countryRepository.findByName(name);
        isExist = Objects.nonNull(country);
        return isExist;
    }


    @PutMapping("district/addDistrict")
    public District addDistrictToState(@RequestBody GeoDataDTO geoDataDTO){
        District district1 = new District();
        if(geoDataDTO.getParentId() != null){
            State state = stateRepository.getById(geoDataDTO.getParentId());
            district1.setState(state);
            district1.setName(geoDataDTO.getDistrict().getName());
            district1 = districtRepository.save(district1);
        }else if(geoDataDTO.getParentName() != null){
            State state = stateRepository.findByName(geoDataDTO.getParentName());
            district1.setState(state);
            district1.setName(geoDataDTO.getDistrict().getName());
            district1 = districtRepository.save(district1);
        }
        return district1;
    }

    @PutMapping("zone/addZone")
    public Zone addZoneToDistrict(@RequestBody GeoDataDTO geoDataDTO){
        Zone zone1 = new Zone();
        if(geoDataDTO.getParentId() != null){
            District district = districtRepository.getById(geoDataDTO.getParentId());
            zone1.setDistrict(district);
            zone1.setName(geoDataDTO.getZone().getName());
            zone1 = zoneRepository.save(zone1);
        }else if(geoDataDTO.getParentName() != null){
            District district = districtRepository.findByName(geoDataDTO.getParentName());
            zone1.setDistrict(district);
            zone1.setName(geoDataDTO.getZone().getName());
            zone1 = zoneRepository.save(zone1);
        }
        return zone1;
    }


}
