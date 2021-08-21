package com.flash.smartenergy.entity;

import java.util.Date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EBAPI getEbapi() {
        return ebapi;
    }

    public void setEbapi(EBAPI ebapi) {
        this.ebapi = ebapi;
    }

    public Float getCurrent1() {
        return current1;
    }

    public void setCurrent1(Float current1) {
        this.current1 = current1;
    }

    public Float getCurrent2() {
        return current2;
    }

    public void setCurrent2(Float current2) {
        this.current2 = current2;
    }

    public Float getCurrent3() {
        return current3;
    }

    public void setCurrent3(Float current3) {
        this.current3 = current3;
    }

    public Float getVoltage1() {
        return voltage1;
    }

    public void setVoltage1(Float voltage1) {
        this.voltage1 = voltage1;
    }

    public Float getVoltage2() {
        return voltage2;
    }

    public void setVoltage2(Float voltage2) {
        this.voltage2 = voltage2;
    }

    public Float getVoltage3() {
        return voltage3;
    }

    public void setVoltage3(Float voltage3) {
        this.voltage3 = voltage3;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Float getTotalUnitsConsumed() {
        return totalUnitsConsumed;
    }

    public void setTotalUnitsConsumed(Float totalUnitsConsumed) {
        this.totalUnitsConsumed = totalUnitsConsumed;
    }

    public Float getHourlyUnitsConsumed() {
        return hourlyUnitsConsumed;
    }

    public void setHourlyUnitsConsumed(Float hourlyUnitsConsumed) {
        this.hourlyUnitsConsumed = hourlyUnitsConsumed;
    }

    public Boolean getLastUpdatedData() {
        return isLastUpdatedData;
    }

    public void setLastUpdatedData(Boolean lastUpdatedData) {
        isLastUpdatedData = lastUpdatedData;
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
}
