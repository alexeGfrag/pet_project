package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.db.Good;

public interface Degradable {
    
    boolean isSpoiled(Good good);

}
