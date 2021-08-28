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
@Entity
@Table(name = "APIFields_TBL")
public class APIFields extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apifields_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ebapi_id", referencedColumnName = "ebapi_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private EBAPI ebapi;

    private Float current1;

    private Float current2;

    private Float current3;

    private Float voltage1;

    private Float voltage2;

    private Float voltage3;

    private int frequency;

    @NotNull
    private Float totalUnitsConsumed;

    private Float hourlyUnitsConsumed;

    private Boolean isLastUpdatedData;
}
