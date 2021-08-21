package com.flash.smartenergy.entity;

import java.util.Date;

public class Zone {

    private String id;

    private String name;

    private District district;//Back foreign key

    private Date createTime;

    private Date updateTime;

    private Boolean retired;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }
}
