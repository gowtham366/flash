package com.flash.smartenergy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
@Entity
@Table(name = "User_TBL")
public class User extends AuditModel<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<EBAPI> ebapis = new HashSet<EBAPI>();

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "credential_id",referencedColumnName = "credential_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
    @JoinColumn(name = "address_id",referencedColumnName = "address_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Address address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
}
