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
public class EBAPI {

    private String id;

    private User user;

    private String name;

    private String serviceNumber;

    private String apiKey;

    private Zone zone;

    private Boolean isActive;

    private int phase;

    private Date createTime;

    private Date updateTime;

    private APIFields[] apiFields;

    private Appliances[] appliances;

    private Boolean retired;

}
