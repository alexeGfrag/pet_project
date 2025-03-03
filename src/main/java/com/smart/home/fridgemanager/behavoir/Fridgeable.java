package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.db.entity.goods.Good;

public interface Fridgeable {

    Good putInFridge(Good good);

    Good getFromFridge(Good good);
}
