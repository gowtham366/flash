package com.flash.smartenergy.service;

import com.flash.smartenergy.entity.test.User_Ext;
import com.flash.smartenergy.repository.JWTUserRepository;
import com.flash.smartenergy.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    /*    @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            return new User("test","test",new ArrayList<>());
        }*/
    @Autowired
    private JWTUserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User_Ext user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomUserDetails(user);
    }
}
