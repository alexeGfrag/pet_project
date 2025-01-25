package com.smart.home.fridgemanager.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

@Data
@Entity
public abstract class PackagedGood extends Good {

    @Column(name = "COUNT")
    private AtomicInteger count;

    public abstract int getAny();

    public abstract int putAny(int valueToAdd);
}
