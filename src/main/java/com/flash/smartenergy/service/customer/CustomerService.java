package com.flash.smartenergy.service.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerService {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Customer Dashboard";
    }
}
