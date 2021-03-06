package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.HiddenProperty;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by luan vu on 1/25/2017.
 * Lớp học
 */
@Entity
@Table(name = "U_LASS")
public class UClass extends BaseEntity implements HiddenProperty {
    private Long id;
    private String name;
    private boolean hidden;
    private University university;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "HIDDEN")
    @Type(type = NullBoolean.NAME)
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @JoinColumn(name = "UNIVERSITY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}
