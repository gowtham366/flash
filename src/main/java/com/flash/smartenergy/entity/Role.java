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
public class Role {

    private String id;

    private String name;

    private String description;

    private User[] users; // Many to Many

    private Date createTime;

    private Date updateTime;

    private Boolean retired;

}
