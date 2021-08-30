package com.flash.smartenergy.config;

import com.flash.smartenergy.security.CustomUserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
public class JpaAuditingConfiguration implements AuditorAware<String>{

    @Override
    public Optional<String> getCurrentAuditor() {
         /*
          if you are using spring security, you can get the currently logged username with following code segment.
          SecurityContextHolder.getContext().getAuthentication().getName()
         */
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null ||
                !authentication.isAuthenticated() ||
                authentication instanceof AnonymousAuthenticationToken) {
            return Optional.ofNullable("sys");
        }
        return Optional.ofNullable(((CustomUserDetails)authentication.getPrincipal()).getUsername());
    }

}