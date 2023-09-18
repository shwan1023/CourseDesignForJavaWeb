package com.sdust.wan.webprojecttest.entity;

import com.sdust.wan.webprojecttest.base.entity.AbstractBaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Students extends AbstractBaseEntity {
    private String noStudent;
    private String nameStudent;
    private String sex;
    private String grade;
}
