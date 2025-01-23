package com.smart.home.fridgemanager.db;

import com.smart.home.fridgemanager.constants.Category;
import com.smart.home.fridgemanager.constants.GoodStatus;
import com.smart.home.fridgemanager.constants.Location;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
public abstract class Good extends BaseEntityWithId{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

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
//    @SQLRestriction("goodState.stateDate >= this.datePosted.atStartOfDay()")
    private Set<GoodState> goodState = new HashSet<>();

    @Column(name = "DATE_POSTED")
    private LocalDate datePosted;
}
