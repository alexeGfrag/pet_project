package com.smart.home.fridgemanager.db.entity.goods;

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
@Table(name = SingleGood.tableName, schema = SingleGood.schemaName)
public class SingleGood extends Good {

    public static final String tableName = "SINGLE_GOOD";

    public static final String schemaName = "FRIDGE";
}
