package com.flash.smartenergy.entity;

import java.util.Date;

public class State {

    String id;

    String name;

    Country country;//back foreign key
    
    District[] districts;

    Date createTime;

    Date updateTime;
}
