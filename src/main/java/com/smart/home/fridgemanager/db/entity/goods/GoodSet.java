package com.smart.home.fridgemanager.db.entity.goods;

import com.smart.home.fridgemanager.exceptions.EmptyGoodSetException;
import com.smart.home.fridgemanager.exceptions.NotEnoughGoodsException;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
@Table(name = GoodSet.tableName, schema = GoodSet.schemaName)
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class GoodSet extends PackagedGood {

    public static final String tableName = "PRODUCT_SET";

    public static final String schemaName = "FRIDGE";

    @Override
    public int getAny(int delta) {
        if (this.getCount() == 0) {
            throw new EmptyGoodSetException(String.format("%s не найден", this.getName()));
        }
        if (this.getCount() < delta) {
            throw new NotEnoughGoodsException(String.format("Доступно только %d шт. продукта %s", this.getCount(), this.getName()));
        }
        int result = this.getCount() - delta;
        this.setCount(result);
        return result;
    }

    @Override
    public int putAny(int valueToAdd) {
        return 1;
    }
}
