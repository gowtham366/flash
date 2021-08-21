package com.flash.smartenergy.entity;

import java.util.Date;

public class EBAPI {

    private String id;

    private User user;

    private String name;

    private String serviceNumber;

    private String apiKey;

    private Zone zone;

    private Boolean isActive;

    private int phase;

    private Date createTime;

    private Date updateTime;

    private APIFields[] apiFields;

    private Appliances[] appliances;

    private Boolean retired;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
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

    public APIFields[] getApiFields() {
        return apiFields;
    }

    public void setApiFields(APIFields[] apiFields) {
        this.apiFields = apiFields;
    }

    public Appliances[] getAppliances() {
        return appliances;
    }

    public void setAppliances(Appliances[] appliances) {
        this.appliances = appliances;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }
}
