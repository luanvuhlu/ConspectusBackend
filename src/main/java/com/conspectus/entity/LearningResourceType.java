package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by luan vu on 2/5/2017.
 */
@Entity
@Table(name = "LEARNING_RESOURCE_TYPE")
public class LearningResourceType extends BaseEntity {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
