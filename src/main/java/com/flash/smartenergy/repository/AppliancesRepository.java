package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Appliances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliancesRepository extends JpaRepository<Appliances,Long> {
}
