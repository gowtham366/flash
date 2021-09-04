package com.flash.smartenergy.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flash.smartenergy.entity.test.User_Ext;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
/*@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)*/
//@Getter(AccessLevel.PROTECTED)
//@Setter(AccessLevel.PROTECTED)
public abstract class AuditModel<U> implements Serializable {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_time", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_time", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    @Column(name = "createdUser", nullable = false, updatable = false)
    @CreatedBy
    private U createdUser;

    @Column(name = "updatedUser", nullable = false)
    @LastModifiedBy
    private U updatedUser;

    @NotNull
    @ColumnDefault("false")
    private Boolean retired = false;
}
