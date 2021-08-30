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
}
