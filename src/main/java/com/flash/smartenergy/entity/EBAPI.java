package com.flash.smartenergy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "EBAPI_TBL")
public class EBAPI extends AuditModel<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ebapi_id")
    private Long id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id", nullable = false)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    private String name;

    @NotNull
    private String serviceNumber;

    @NotNull
    private String apiKey;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id", referencedColumnName = "zone_id",nullable = false)
    private Zone zone;

    //@ColumnDefault("true") //TODO:Update this at last to false
    private Boolean isActive = true;

    private int phase;

    @JsonManagedReference
    @OneToMany(mappedBy = "ebapi", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<APIFields> apiFields = new HashSet<APIFields>();

    @JsonManagedReference
    @OneToMany(mappedBy = "ebapi", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Appliances> appliances = new HashSet<Appliances>();

    @JsonManagedReference
    @OneToMany(mappedBy = "ebapi", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Switch_Ext> switch_ext = new HashSet<Switch_Ext>();

}
