package com.smart.home.fridgemanager.db;

import jakarta.persistence.*;

@Entity
public abstract class BaseEntityWithId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Version
    private Long version;
}
