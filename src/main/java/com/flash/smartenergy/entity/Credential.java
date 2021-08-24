package com.flash.smartenergy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Credential_TBL")
public class Credential extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credential_id")
    private Long id;

    @Column(unique = true, nullable = false)
    @Size(max = 20)
    private String username;

    @NotNull
    private String password;

    @ColumnDefault("true")
    private Boolean isActive;

    @OneToOne(mappedBy = "credential",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false)
    private User user;

    private String token;

}
