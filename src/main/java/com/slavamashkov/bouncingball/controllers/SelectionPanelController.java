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

    private static final List<Double> allowedDegrees = Arrays.asList(45.0, 90.0, 135.0, 180.0);
    private Iterator<Double> listIterator = allowedDegrees.listIterator();

    boolean isSwitchExtPowButtonPressed = false;

    @FXML private void switchExtPowButton(MouseEvent mouseEvent) {
        BottomInfoPaneController bottomInfoPaneController = BottomInfoPaneController.getInstance();

        isSwitchExtPowButtonPressed = !isSwitchExtPowButtonPressed;

        if (isSwitchExtPowButtonPressed) {
            bottomInfoPaneController.activateExtPwr();
        } else {
            bottomInfoPaneController.deactivateExtPwr();
        }

    }

    @FXML private void changeDegree(MouseEvent mouseEvent) {
        if (!listIterator.hasNext()) {
            listIterator = allowedDegrees.listIterator();
            selectorGroup.setRotate(0.0);
            displayBatteryVoltage(selectorGroup.getRotate());
        } else {
            selectorGroup.setRotate(listIterator.next());
            displayBatteryVoltage(selectorGroup.getRotate());
        }
    }

    private void displayBatteryVoltage(double rotationDegree) {
        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();

        if (rotationDegree == 0.0) {
            batteryVoltageIndicator.setText(String.valueOf(0.0));
        } else if (rotationDegree == 45.0) {
            batteryVoltageIndicator.setText(String.valueOf(controller.getBat1Voltage()));
        } else if (rotationDegree == 90.0) {
            batteryVoltageIndicator.setText(String.valueOf(controller.getBat2Voltage()));
        } else if (rotationDegree == 135.0) {
            batteryVoltageIndicator.setText(String.valueOf(controller.getBat3Voltage()));
        } else if (rotationDegree == 180.0) {
            batteryVoltageIndicator.setText(String.valueOf(controller.getBat4Voltage()));
        } else {
            // todo
            // залогировать неподдерживаемое значение селектора
            batteryVoltageIndicator.setText(String.valueOf(0.0));
        }
    }

    private void glowOn(Rectangle zone) {
        zone.setOpacity(1.0);
    }

    private void glowOff(Rectangle zone) {
        zone.setOpacity(0.0);
    }

    @FXML private void bat1zoneGlowOn() {
        glowOn(bat1AllowedZone);
    }

    @FXML private void bat2zoneGlowOn() {
        glowOn(bat2AllowedZone);
    }

    @FXML private void bat3zoneGlowOn() {
        glowOn(bat3AllowedZone);
    }

    @FXML private void bat4zoneGlowOn() {
        glowOn(bat4AllowedZone);
    }

    @FXML private void invZoneGlowOn() {
        glowOn(invAllowedZone);
    }

    @FXML private void leftGenZoneGlowOn() {
        glowOn(leftGenAllowedZone);
    }

    @FXML private void rightGenZoneGlowOn() {
        glowOn(rightGenAllowedZone);
    }

    @FXML private void leftDriveZoneGlowOn() {
        glowOn(leftDriveAllowedZone);
    }

    @FXML private void rightDriveZoneGlowOn() {
        glowOn(rightDriveAllowedZone);
    }

    @FXML private void apuZoneGlowOn() {
        glowOn(apuAllowedZone);
    }

    @FXML private void ratZoneGlowOn() {
        glowOn(ratAllowedZone);
    }

    @FXML private void extZoneGlowOn() {
        glowOn(extAllowedZone);
    }

    @FXML private void bat1zoneGlowOff() {
        glowOff(bat1AllowedZone);
    }

    @FXML private void bat2zoneGlowOff() {
        glowOff(bat2AllowedZone);
    }

    @FXML private void bat3zoneGlowOff() {
        glowOff(bat3AllowedZone);
    }

    @FXML private void bat4zoneGlowOff() {
        glowOff(bat4AllowedZone);
    }

    @FXML private void invZoneGlowOff() {
        glowOff(invAllowedZone);
    }

    @FXML private void leftGenZoneGlowOff() {
        glowOff(leftGenAllowedZone);
    }

    @FXML private void rightGenZoneGlowOff() {
        glowOff(rightGenAllowedZone);
    }

    @FXML private void leftDriveZoneGlowOff() {
        glowOff(leftDriveAllowedZone);
    }

    @FXML private void rightDriveZoneGlowOff() {
        glowOff(rightDriveAllowedZone);
    }

    @FXML private void apuZoneGlowOff() {
        glowOff(apuAllowedZone);
    }

    @FXML private void ratZoneGlowOff() {
        glowOff(ratAllowedZone);
    }

    @FXML private void extZoneGlowOff() {
        glowOff(extAllowedZone);
    }
}