package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
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
@Table(name = "Appliances_TBL")
public class Appliances extends AuditModel<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appliances_id")
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ebapi_id",referencedColumnName = "ebapi_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private EBAPI ebapi; //back foreign key -- Mostly not needed

    @NotNull
    private String name;

    @NotNull
    @ColumnDefault("0")
    private int watt;

}
