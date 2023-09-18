package com.sdust.wan.webprojecttest.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.sdust.wan.webprojecttest.base.entity.AbstractBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Teachers extends AbstractBaseEntity {
    private String noTeacher;
    private String nameTeacher;
    private String sex;
    private String grade;
}
