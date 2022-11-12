package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class ElecUnitsConnectionsController implements Controller {
    @FXML private Pane fromLeftDriveToLeft;
    @FXML private Pane leftDriveInfoPane;
    @FXML private Pane fromRightDriveToRight;
    @FXML private Pane rightDriveInfoPane;
    @FXML private Pane fromExtToLeft;
    @FXML private Pane fromExtToRight;

    private static ElecUnitsConnectionsController instance;

    public ElecUnitsConnectionsController() {
        instance = this;
    }

    public static ElecUnitsConnectionsController getInstance() {
        return instance;
    }

    public void activateExtPwrConnection() {
        fromExtToLeft.setOpacity(1.0);
        fromExtToRight.setOpacity(1.0);
    }

    public void deactivateExtPwrConnection() {
        fromExtToLeft.setOpacity(0.0);
        fromExtToRight.setOpacity(0.0);
    }

    public void activateLeftDriveToLeftConnection() {
        leftDriveInfoPane.setOpacity(1.0);
        fromLeftDriveToLeft.setOpacity(1.0);
    }

    public void deactivateLeftDriveToLeftConnection() {
        leftDriveInfoPane.setOpacity(0.0);
        fromLeftDriveToLeft.setOpacity(0.0);
    }

    public void activateRightDriveToRightConnection() {
        rightDriveInfoPane.setOpacity(1.0);
        fromRightDriveToRight.setOpacity(1.0);
    }

    public void deactivateRightDriveToRightConnection() {
        rightDriveInfoPane.setOpacity(0.0);
        fromRightDriveToRight.setOpacity(0.0);
    }
}