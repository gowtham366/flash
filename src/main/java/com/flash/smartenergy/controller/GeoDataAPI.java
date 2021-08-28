package com.flash.smartenergy.controller;

import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.State;
import com.flash.smartenergy.repository.CountryRepository;
import com.flash.smartenergy.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public Country addCountry(@RequestBody Country country){

        return null;
    }
}
