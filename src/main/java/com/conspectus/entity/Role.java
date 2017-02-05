package com.conspectus.entity;

import com.conspectus.entity.base.IEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "ROLE")
public class Role{
    private Long id;
}
