package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String id;

    private EBAPI[] ebapis;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private Date dateOfReg;

    private Role[] roles; //Many to Many

    private Switch_Ext[] switches;

    private Address address;

    private Date lastLogin;

    private Boolean retired;

}
