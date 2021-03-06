package com.flash.smartenergy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.flash.smartenergy.repository.DistrictRepository;
import com.flash.smartenergy.repository.ZoneRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Zone_TBL")
public class Zone extends AuditModel<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zone_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "district_id",referencedColumnName = "district_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private District district;//Back foreign key

/*
    @OneToOne(mappedBy = "zone")
    private EBAPI ebapi;
*/

    /*@OneToOne(mappedBy = "zone")
    private Address address;*/

}
