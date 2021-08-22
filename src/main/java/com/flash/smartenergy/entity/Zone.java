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
public class Zone {

    private String id;

    private String name;

    private District district;//Back foreign key

    private Date createTime;

    private Date updateTime;

    private Boolean retired;

}
