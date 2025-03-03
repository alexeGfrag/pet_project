package com.smart.home.fridgemanager.db.entity.baseEntities;

import jakarta.persistence.*;

@Entity
public abstract class BaseNonUpdatableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
}
