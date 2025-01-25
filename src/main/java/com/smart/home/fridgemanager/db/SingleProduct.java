package com.smart.home.fridgemanager.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Table(name = SingleProduct.tableName, schema = SingleProduct.schemaName)
public class SingleProduct extends Good {

    public static final String tableName = "SINGLE_PRODUCT";

    public static final String schemaName = "FRIDGE";
}
