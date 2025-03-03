package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.db.entity.goods.Good;

public interface Degradable {
    
    boolean isSpoiled(Good good);

}
