package com.smart.home.fridgemanager.constants;

import lombok.Getter;

@Getter
public enum GoodStateEnum {
    FREEZED("Заморожен"),
    COOLED("Охлажден"),
    SPOILED("Испорчен"),
    EXPIRING("Заканчивается срок годности"),
    UNKNOWN("Неизвестно");
    private final String description;

    GoodStateEnum(String description) {
        this.description = description;
    }
}
