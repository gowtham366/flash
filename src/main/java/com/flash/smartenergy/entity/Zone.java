package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Zone_TBL")
public class Zone extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zone_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private District district;//Back foreign key

    @OneToOne(mappedBy = "zone")
    private EBAPI ebapi;

    @OneToOne(mappedBy = "zone")
    private Address address;
}
