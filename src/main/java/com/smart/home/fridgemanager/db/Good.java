package com.smart.home.fridgemanager.db;

import com.smart.home.fridgemanager.constants.CategoryEnum;
import com.smart.home.fridgemanager.constants.GoodStateEnum;
import com.smart.home.fridgemanager.constants.Location;
import lombok.Data;



@Data
public abstract class Good {

    private Location location;

    private CategoryEnum category;

    private GoodStateEnum state;

    private String description;
}
