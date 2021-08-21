package com.flash.smartenergy.entity;

import java.util.Date;

public class APIFields {

    String id;

    EBAPI ebapi;//back foreign key

    Float current1;

    Float current2;

    Float current3;

    Float voltage1;

    Float voltage2;

    Float voltage3;

    int frequency;

    Float totalUnitsConsumed;

    Float hourlyUnitsConsumed;

    Boolean isLastUpdatedData;

    Date createTime;

    Date updateTime;
}
