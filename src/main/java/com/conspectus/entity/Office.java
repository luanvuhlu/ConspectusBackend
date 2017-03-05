package com.conspectus.entity;

import com.conspectus.entity.base.BaseEntity;
import com.conspectus.entity.base.HiddenProperty;
import com.conspectus.entity.base.NameProperty;
import com.conspectus.hibernate.type.NullBoolean;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

/**
 * Created by luan vu on 1/25/2017.
 * Văn phòng
 */
@Entity
@Table(name = "OFFICE")
@TypeDefs({
    @TypeDef(name = NullBoolean.NAME, typeClass = NullBoolean.class)
})
public class Office extends BaseEntity implements NameProperty, HiddenProperty {
    private Long id;
    private University university;
    private String name;
    private String nameAbbr;
    private String addrress;
    private boolean hidden;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JoinColumn(name = "UNIVERSITY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "NAME_ABBR")
    public String getNameAbbr() {
        return nameAbbr;
    }

    public void setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }

    @Column(name = "HIDDEN")
    @Type(type = NullBoolean.NAME)
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
