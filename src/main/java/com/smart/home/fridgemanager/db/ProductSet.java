package com.smart.home.fridgemanager.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = ProductSet.tableName, schema = ProductSet.schemaName)
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class ProductSet extends PackagedGood {

    public static final String tableName = "PRODUCT_SET";

    public static final String schemaName = "FRIDGE";

    @Override
    public int getAny() {
        return this.getCount().decrementAndGet();
    }

    @Override
    public int putAny(int valueToAdd) {
        return this.getCount().addAndGet(valueToAdd);
    }
}
