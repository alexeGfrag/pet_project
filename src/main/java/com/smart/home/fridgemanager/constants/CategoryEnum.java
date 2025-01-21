package com.smart.home.fridgemanager.constants;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    DRINK("Напиток"),
    SAUCE("Соус"),
    MEAT("Мясо/птица"),
    MEAL("Готовая еда"),
    VEGETABLE("Овощи"),
    FISH("Рыба/рыбный продукт"),
    SEMI_FINISHED("Полуфабрикат"),
    DAIRY("Молоко/Молочный продукт"),
    EGGS("Яйца"),
    FLOUR("Мучное изделие"),
    CONFECTIONERY("Кондитерское изделие"),
    MUSHROOMS("Грибы"),
    FROZEN("Продукт заморозки");

    private final String description;

    CategoryEnum(String description) {
        this.description = description;
    }
}
