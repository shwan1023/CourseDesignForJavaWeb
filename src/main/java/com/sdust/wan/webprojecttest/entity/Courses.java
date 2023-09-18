package com.sdust.wan.webprojecttest.entity;

import com.sdust.wan.webprojecttest.base.entity.AbstractBaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Courses extends AbstractBaseEntity {
    private String noCourse;
    private String nameCourse;
}
