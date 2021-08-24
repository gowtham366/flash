package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {
}
