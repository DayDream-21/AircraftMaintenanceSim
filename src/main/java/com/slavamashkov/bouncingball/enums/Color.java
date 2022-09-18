package com.slavamashkov.bouncingball.enums;

public enum Color {
    ACTIVE_COLOR("#00ff25"),
    ERROR_COLOR("#ff8300"),
    INACTIVE_COLOR("#ffffff");

    public final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }
}