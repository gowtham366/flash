package com.flash.smartenergy.service.common;

import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.State;
import com.flash.smartenergy.repository.CountryRepository;
import com.flash.smartenergy.repository.StateRepository;
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

    @GetMapping("country/getAllCountries")
    public List<Country> getAllCoutries(){
        return countryRepository.findAll();
    }

    @GetMapping("country/getStates/{countryName}")
    public State[] findByName(@PathVariable("countryName")
                                      String countryName) {
        Country country = countryRepository.findByName(countryName);
        State[] states = new State[country.getStates().size()];
        return country.getStates().toArray(states);
    }

    @PutMapping("country/addCountry")
    public Country addCountry(@RequestBody Country country, Authentication authentication){
        Country response;
        if(validateCountry(country)){
            response = new Country();
            response.setName(country.getName());

            /*State state = new State();
            state.setName(country.getStates());
            response.setStates(country.getStates());*/
            response = countryRepository.save(response);
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
}
