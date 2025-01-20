package com.smart.home.fridgemanager.behavoir;

import com.smart.home.fridgemanager.constants.Compartment;
import com.smart.home.fridgemanager.db.Good;

public interface Keepable {

    Good keep(Good good, Compartment compartment);
}
