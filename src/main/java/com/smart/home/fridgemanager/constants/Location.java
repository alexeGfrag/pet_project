package com.smart.home.fridgemanager.constants;

import lombok.Getter;

@Getter
public enum Location {
    SHELF("Полка"),
    VEGETS_COMPARTMENT("Отсек для овощей"),
    DOOR("Дверь"),
    FREEZER("Морозилка"),
    UNKNOWN("Неизвестно");

    private final String stateDescription;

    Location(String stateDescription) {
        this.stateDescription = stateDescription;
    }
}
