package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UpperInfoPaneController {
    @FXML private Label bat1VoltageValue;
    @FXML private Label bat2VoltageValue;
    @FXML private Label bat3VoltageValue;
    @FXML private Label bat4VoltageValue;

    public double getBat1Voltage() {
        return Double.parseDouble(bat1VoltageValue.getText());
    }

    public double getBat2Voltage() {
        return Double.parseDouble(bat2VoltageValue.getText());
    }

    public double getBat3Voltage() {
        return Double.parseDouble(bat3VoltageValue.getText());
    }

    public double getBat4Voltage() {
        return Double.parseDouble(bat4VoltageValue.getText());
    }
}
