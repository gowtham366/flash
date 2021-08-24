package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.APIFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APIFieldsRepository extends JpaRepository<APIFields,Long> {
}
