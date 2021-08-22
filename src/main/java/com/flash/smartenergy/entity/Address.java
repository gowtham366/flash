package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {


    private String id;

    private String addressLine1;

    private String addressLine2;

    private Country country;

    private State state;

    private District district;

    private Zone zone;

    private String zipCode;

}
