package com.flash.smartenergy.service.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminService {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Admin Dashboard";
    }
}
