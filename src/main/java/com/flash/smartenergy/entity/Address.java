package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="Address_TBL")
public class Address extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @NotNull
    @Size(max = 100)
    //@Column(unique = true)
    private String addressLine1;

    private String addressLine2;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id",nullable = false)
    private Country country;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "state_id",nullable = false)
    private State state;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id",nullable = false)
    private District district;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id",nullable = false)
    private Zone zone;

    @NotNull
    @Size(min = 6,max = 6)
    private String zipCode;

    @OneToOne(mappedBy = "user")
    private User user;

}
