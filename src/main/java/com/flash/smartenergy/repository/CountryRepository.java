package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    Country findByName(String name);

}
