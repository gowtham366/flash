package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone,Long> {
}
