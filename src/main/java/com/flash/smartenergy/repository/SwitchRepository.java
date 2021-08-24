package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Switch_Ext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchRepository extends JpaRepository<Switch_Ext,Long> {
}
