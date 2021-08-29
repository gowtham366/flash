package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Address_TBL")
public class Address extends AuditModel<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @NotNull
    @Size(max = 100)
    //@Column(unique = true)
    private String addressLine1;

    private String addressLine2;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id",referencedColumnName = "country_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Country country;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "state_id",referencedColumnName = "state_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private State state;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id",referencedColumnName = "district_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private District district;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id",referencedColumnName = "zone_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Zone zone;

    @NotNull
    @Size(min = 6,max = 6)
    private String zipCode;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,mappedBy = "address")
    private User user;

}
