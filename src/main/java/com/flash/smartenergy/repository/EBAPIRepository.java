package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.EBAPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EBAPIRepository extends JpaRepository<EBAPI,Long> {
}
