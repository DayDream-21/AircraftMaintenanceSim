package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;

public class BottomInfoPaneController {
    @FXML private ElecUnitsConnectionsController fxidElecUnitsConnectionsController;
    @FXML private ElecUnitsController fxidElecUnitsController;

    private static BottomInfoPaneController instance;

    public BottomInfoPaneController() {
        instance = this;
    }

    public static BottomInfoPaneController getInstance() {
        return instance;
    }

    public void activateExtPwr() {
        fxidElecUnitsConnectionsController.activateExtPwrConnection();
        fxidElecUnitsController.activateExtPwr();
    }

    public void deactivateExtPwr() {
        fxidElecUnitsConnectionsController.deactivateExtPwrConnection();
        fxidElecUnitsController.deactivateExtPwr();
    }

    public void activateLeftEngine() {
        fxidElecUnitsConnectionsController.activateLeftDriveToLeftConnection();
        fxidElecUnitsController.activateLeftEngine();
    }

    public void deactivateLeftEngine() {
        fxidElecUnitsConnectionsController.deactivateLeftDriveToLeftConnection();
        fxidElecUnitsController.deactivateLeftEngine();
    }

    public void activateRightEngine() {
        fxidElecUnitsConnectionsController.activateRightDriveToRightConnection();
        fxidElecUnitsController.activateRightEngine();
    }

    public void deactivateRightEngine() {
        fxidElecUnitsConnectionsController.deactivateRightDriveToRightConnection();
        fxidElecUnitsController.deactivateRightEngine();
    }

    public void activateErrorLeftEngine() {
        fxidElecUnitsConnectionsController.deactivateLeftDriveToLeftConnection();
        // fxidElecUnitsController.activateErrorLeftEngine();
    }

    public void deactivateErrorLeftEngine() {
        fxidElecUnitsConnectionsController.activateLeftDriveToLeftConnection();
        // fxidElecUnitsController.deactivateErrorLeftEngine();
    }

    public void activateErrorRightEngine() {
        fxidElecUnitsConnectionsController.deactivateRightDriveToRightConnection();
        // fxidElecUnitsController.activateErrorRightEngine();
    }

    public void deactivateErrorRightEngine() {
        fxidElecUnitsConnectionsController.activateRightDriveToRightConnection();
        // fxidElecUnitsController.deactivateErrorRightEngine();
    }
}