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
public class Appliances {

    private String id;

    private EBAPI ebapi; //back foreign key -- Mostly not needed

    private String name;

    private int watt;

    private Date createTime;

    private Date updateTime;

    private Boolean retired;


}
