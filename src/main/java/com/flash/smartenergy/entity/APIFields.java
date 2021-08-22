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
public class APIFields {

    private String id;

    private EBAPI ebapi;//back foreign key

    private Float current1;

    private Float current2;

    private Float current3;

    private Float voltage1;

    private Float voltage2;

    private Float voltage3;

    private int frequency;

    private Float totalUnitsConsumed;

    private Float hourlyUnitsConsumed;

    private Boolean isLastUpdatedData;

    private Date createTime;

    private Date updateTime;

}
