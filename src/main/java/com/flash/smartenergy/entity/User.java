package com.flash.smartenergy.entity;

import java.util.Date;

public class User {

    private String id;

    private EBAPI[] ebapis;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private Date dateOfReg;

    private Role[] roles; //Many to Many

    private Switch_Ext[] switches;

    private Address address;

    private Date lastLogin;

    private Boolean retired;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EBAPI[] getEbapis() {
        return ebapis;
    }

    public void setEbapis(EBAPI[] ebapis) {
        this.ebapis = ebapis;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public Switch_Ext[] getSwitches() {
        return switches;
    }

    public void setSwitches(Switch_Ext[] switches) {
        this.switches = switches;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }
}
