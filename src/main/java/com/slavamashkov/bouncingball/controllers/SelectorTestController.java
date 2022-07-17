package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SelectorTestController {

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

    List<Double> allowedDegrees = Arrays.asList(0.0, 45.0, 90.0, 135.0, 180.0);
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
            selectorGroup.setRotate(listIterator.next());
        } else {
            selectorGroup.setRotate(listIterator.next());
        }
    }

    public void bat1zoneGlowOn(MouseEvent mouseEvent) {
        glowOn(bat1AllowedZone);
    }

    public void bat2zoneGlowOn(MouseEvent mouseEvent) {
        glowOn(bat2AllowedZone);
    }

    public void bat3zoneGlowOn(MouseEvent mouseEvent) {
        glowOn(bat3AllowedZone);
    }

    public void bat4zoneGlowOn(MouseEvent mouseEvent) {
        glowOn(bat4AllowedZone);
    }

    public void invZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(invAllowedZone);
    }

    public void leftGenZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(leftGenAllowedZone);
    }

    public void rightGenZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(rightGenAllowedZone);
    }

    public void leftDriveZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(leftDriveAllowedZone);
    }

    public void rightDriveZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(rightDriveAllowedZone);
    }

    public void apuZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(apuAllowedZone);
    }

    public void ratZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(ratAllowedZone);
    }

    public void extZoneGlowOn(MouseEvent mouseEvent) {
        glowOn(extAllowedZone);
    }

    public void bat1zoneGlowOff(MouseEvent mouseEvent) {
        glowOff(bat1AllowedZone);
    }

    public void bat2zoneGlowOff(MouseEvent mouseEvent) {
        glowOff(bat2AllowedZone);
    }

    public void bat3zoneGlowOff(MouseEvent mouseEvent) {
        glowOff(bat3AllowedZone);
    }

    public void bat4zoneGlowOff(MouseEvent mouseEvent) {
        glowOff(bat4AllowedZone);
    }

    public void invZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(invAllowedZone);
    }

    public void leftGenZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(leftGenAllowedZone);
    }

    public void rightGenZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(rightGenAllowedZone);
    }

    public void leftDriveZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(leftDriveAllowedZone);
    }

    public void rightDriveZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(rightDriveAllowedZone);
    }

    public void apuZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(apuAllowedZone);
    }

    public void ratZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(ratAllowedZone);
    }

    public void extZoneGlowOff(MouseEvent mouseEvent) {
        glowOff(extAllowedZone);
    }


}
