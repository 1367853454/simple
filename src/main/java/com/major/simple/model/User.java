package com.major.simple.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sys_user")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{

    @Column(name = "name")
    private String name;

}
