package com.flash.smartenergy.entity.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "User_TEST_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Ext {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    public User_Ext(String username,String password,String role){
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);
    }
}