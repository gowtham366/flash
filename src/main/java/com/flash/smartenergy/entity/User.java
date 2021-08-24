package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "User_TBL")
public class User extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @OneToMany(mappedBy = "user")
    private Set<EBAPI> ebapis = new HashSet<EBAPI>();

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "credential_id",nullable = false)
    private Credential credential;

    private String firstName;

    private String lastName;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    private String mobile;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles = new HashSet<Role>(); //Many to Many


    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
}
