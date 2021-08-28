package com.flash.smartenergy.service.eb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eb")
public class EBService {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "EB office Dashboard";
    }
}
