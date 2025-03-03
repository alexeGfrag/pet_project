package com.smart.home.fridgemanager.db.entity.goods;

import com.smart.home.fridgemanager.constants.Category;
import com.smart.home.fridgemanager.constants.GoodStatus;
import com.smart.home.fridgemanager.constants.Location;
import com.smart.home.fridgemanager.db.entity.baseEntities.BaseUpdatableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public abstract class Good extends BaseUpdatableEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private Location location;

    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private GoodStatus status;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<GoodState> goodState = new HashSet<>();

    @Column(name = "DATE_POSTED")
    private LocalDate datePosted;
}
