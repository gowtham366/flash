package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State,Long> {

    List<State> findByCountry(Country country);
}
