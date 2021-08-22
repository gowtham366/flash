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
public class District {

    private String id;

    private String name;

    private State state; //back foreign key

    private Zone[] zones;

    private Date createTime;

    private Date updateTime;

    private Boolean retired;

}
