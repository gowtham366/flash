package com.flash.smartenergy.entity;

import java.util.Date;

public class District {

    String id;

    String name;

    State state; //back foreign key

    Zone[] zones;

    Date createTime;

    Date updateTime;
}
