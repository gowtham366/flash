package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.test.User_Ext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JWTUserRepository extends JpaRepository<User_Ext,Long> {
    User_Ext findByUsername(String username);
}