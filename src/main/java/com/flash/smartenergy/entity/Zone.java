package com.flash.smartenergy.entity;

import java.util.Date;

public class Zone {

    String id;

    String name;

    District district;//Back foreign key

    Date createTime;

    Date updateTime;
}
