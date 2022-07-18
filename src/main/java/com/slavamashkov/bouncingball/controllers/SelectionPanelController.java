package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SelectionPanelController {
    @FXML private UpperInfoPaneController fxidUpperInfoPaneController;

    @FXML private Label batteryVoltageIndicator;
    @FXML private Rectangle invAllowedZone;
    @FXML private Rectangle leftGenAllowedZone;
    @FXML private Rectangle rightGenAllowedZone;
    @FXML private Rectangle leftDriveAllowedZone;
    @FXML private Rectangle rightDriveAllowedZone;
    @FXML private Rectangle apuAllowedZone;
    @FXML private Rectangle ratAllowedZone;
    @FXML private Rectangle extAllowedZone;
    @FXML private Rectangle bat1AllowedZone;
    @FXML private Rectangle bat2AllowedZone;
    @FXML private Rectangle bat3AllowedZone;
    @FXML private Rectangle bat4AllowedZone;
    @FXML private Group selectorGroup;

    List<Double> allowedDegrees = Arrays.asList(45.0, 90.0, 135.0, 180.0);
    Iterator<Double> listIterator = allowedDegrees.listIterator();

    public void glowOn(Rectangle zone) {
        zone.setOpacity(1.0);
    }

    public void glowOff(Rectangle zone) {
        zone.setOpacity(0.0);
    }

    public void changeDegree(MouseEvent mouseEvent) {
        if (!listIterator.hasNext()) {
            listIterator = allowedDegrees.listIterator();
            selectorGroup.setRotate(0.0);
        } else {
            selectorGroup.setRotate(listIterator.next());
        }
    }

    public double getBatterySelectorPosition() {
        return selectorGroup.getRotate();
    }

    public void setBatteryVoltageIndicatorValue(double voltageValue) {
        batteryVoltageIndicator.setText(String.valueOf(voltageValue));
    }



    public void bat1zoneGlowOn() {
        glowOn(bat1AllowedZone);
    }

    public void bat2zoneGlowOn() {
        glowOn(bat2AllowedZone);
    }

    public void bat3zoneGlowOn() {
        glowOn(bat3AllowedZone);
    }

    public void bat4zoneGlowOn() {
        glowOn(bat4AllowedZone);
    }

    public void invZoneGlowOn() {
        glowOn(invAllowedZone);
    }

    public void leftGenZoneGlowOn() {
        glowOn(leftGenAllowedZone);
    }

    public void rightGenZoneGlowOn() {
        glowOn(rightGenAllowedZone);
    }

    public void leftDriveZoneGlowOn() {
        glowOn(leftDriveAllowedZone);
    }

    public void rightDriveZoneGlowOn() {
        glowOn(rightDriveAllowedZone);
    }

    public void apuZoneGlowOn() {
        glowOn(apuAllowedZone);
    }

    public void ratZoneGlowOn() {
        glowOn(ratAllowedZone);
    }

    public void extZoneGlowOn() {
        glowOn(extAllowedZone);
    }

    public void bat1zoneGlowOff() {
        glowOff(bat1AllowedZone);
    }

    public void bat2zoneGlowOff() {
        glowOff(bat2AllowedZone);
    }

    public void bat3zoneGlowOff() {
        glowOff(bat3AllowedZone);
    }

    public void bat4zoneGlowOff() {
        glowOff(bat4AllowedZone);
    }

    public void invZoneGlowOff() {
        glowOff(invAllowedZone);
    }

    public void leftGenZoneGlowOff() {
        glowOff(leftGenAllowedZone);
    }

    public void rightGenZoneGlowOff() {
        glowOff(rightGenAllowedZone);
    }

    public void leftDriveZoneGlowOff() {
        glowOff(leftDriveAllowedZone);
    }

    public void rightDriveZoneGlowOff() {
        glowOff(rightDriveAllowedZone);
    }

    public void apuZoneGlowOff() {
        glowOff(apuAllowedZone);
    }

    public void ratZoneGlowOff() {
        glowOff(ratAllowedZone);
    }

    public void extZoneGlowOff() {
        glowOff(extAllowedZone);
    }


}
