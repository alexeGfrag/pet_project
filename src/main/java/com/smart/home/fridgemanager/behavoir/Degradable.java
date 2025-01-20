package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.db.Good;

public interface Degradable {
    
    Good deteriorate(Good good);

    Good chuckOut(Good good);
}
