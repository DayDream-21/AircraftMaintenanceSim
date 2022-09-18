package com.slavamashkov.bouncingball.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class ElecScreenController {
    // All controllers taken from FXML files have "fxid" prefix
    @FXML private BottomInfoPaneController fxidBottomInfoPaneController;
    @FXML private UpperInfoPaneController fxidUpperInfoPaneController;

    @FXML private ToggleButton leftEngineToggleButton;
    @FXML private ToggleButton rightEngineToggleButton;

    public void onActionActivateLeftEngine(ActionEvent actionEvent) {
        if (leftEngineToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateLeftEngine();
        } else {
            fxidBottomInfoPaneController.deactivateLeftEngine();
        }
    }

    public void onActionActivateRightEngine(ActionEvent actionEvent) {
        if (rightEngineToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateRightEngine();
        } else {
            fxidBottomInfoPaneController.deactivateRightEngine();
        }
    }
}