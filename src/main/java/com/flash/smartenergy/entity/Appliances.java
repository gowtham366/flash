package com.flash.smartenergy.entity;

import java.util.Date;

public class Appliances {

    private String id;

    private EBAPI ebapi; //back foreign key -- Mostly not needed

    private String name;

    private int watt;

    private Date createTime;

    private Date updateTime;

    private Boolean retired;


}
