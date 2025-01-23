package com.smart.home.fridgemanager.constants;

import lombok.Getter;

@Getter
public enum GoodStatus {
    FREEZED("Заморожен"),
    COOLED("Охлажден"),
    SPOILED("Испорчен"),
    EXPIRING("Заканчивается срок годности"),
    UNKNOWN("Неизвестно");
    private final String description;

    GoodStatus(String description) {
        this.description = description;
    }
}
