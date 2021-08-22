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
public class Credential {

    private String id;

    private String userName;

    private String password;

    private Boolean isActive;

    private Date createTime;

    private Date updateTime;

    private String token;

}
