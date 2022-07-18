package com.slavamashkov.bouncingball.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class SSJMainController {
    // All controllers taken from FXML files have "fxid" prefix
    @FXML private BottomInfoPaneController fxidBottomInfoPaneController;
    @FXML private SelectionPanelController fxidSelectionPanelController;
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

    public void displayBatteryVoltage() {
        double selectorPosition = fxidSelectionPanelController.getBatterySelectorPosition();

        System.out.println("Selector position: " + selectorPosition);

        if (selectorPosition == 0.0) {
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(0.0);
        } else if (selectorPosition == 45.0) {
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(fxidUpperInfoPaneController.getBat1Voltage());
        } else if (selectorPosition == 90.0) {
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(fxidUpperInfoPaneController.getBat2Voltage());
        } else if (selectorPosition == 135.0) {
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(fxidUpperInfoPaneController.getBat3Voltage());
        } else if (selectorPosition == 180.0) {
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(fxidUpperInfoPaneController.getBat4Voltage());
        } else {
            // todo
            // залогировать неподдерживаемое значение селектора
            fxidSelectionPanelController.setBatteryVoltageIndicatorValue(0.0);
        }
    }
}
