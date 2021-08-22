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
public class State {

    private String id;

    private String name;

    private Country country;//back foreign key

    private District[] districts;

    private Date createTime;

    private Date updateTime;

    private Boolean retired;

}
