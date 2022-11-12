package com.slavamashkov.bouncingball.errors;

public class ErrorParameter {
    private String fxName;
    private String fxValue;

    public ErrorParameter(String fxName, String fxValue) {
        this.fxName = fxName;
        this.fxValue = fxValue;
    }

    public String getFxName() {
        return fxName;
    }

    public String getFxValue() {
        return fxValue;
    }
}
