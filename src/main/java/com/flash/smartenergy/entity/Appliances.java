package com.flash.smartenergy.entity;

import java.util.Date;

public class Appliances {

    String id;

    EBAPI ebapi; //back foreign key -- Mostly not needed

    String name;

    int watt;

    Date createTime;

    Date updateTime;
}
