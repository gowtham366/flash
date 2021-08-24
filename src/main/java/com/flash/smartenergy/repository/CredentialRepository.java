package com.flash.smartenergy.repository;

import com.flash.smartenergy.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential,Long> {
}
