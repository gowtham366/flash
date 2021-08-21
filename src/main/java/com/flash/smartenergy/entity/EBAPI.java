package com.flash.smartenergy.entity;

import java.util.Date;

public class EBAPI {

    String id;

    User user;

    String name;

    String serviceNumber;

    String apiKey;

    Zone zone;

    Boolean isActive;

    int phase;

    Date createTime;

    Date updateTime;

    APIFields[] apiFields;

    Appliances[] appliances;

}
