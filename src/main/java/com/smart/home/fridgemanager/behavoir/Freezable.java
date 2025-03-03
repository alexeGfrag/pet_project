package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.db.entity.goods.Good;

public interface Freezable {

    Good putInFreezer(Good good);

    Good getFromFreezer(Good good);
}
