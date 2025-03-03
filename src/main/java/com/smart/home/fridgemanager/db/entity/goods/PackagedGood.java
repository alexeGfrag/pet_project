package com.smart.home.fridgemanager.db.entity.goods;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public abstract class PackagedGood extends Good {

    @Column(name = "COUNT")
    private Integer count;

    public abstract int getAny(int delta);

    public abstract int putAny(int valueToAdd);
}
