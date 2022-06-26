package com.slavamashkov.bouncingball.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SSJMainController {
    // All controllers taken from FXML files have "fxid" prefix
    @FXML BottomInfoPaneController fxidBottomInfoPaneController;

    @FXML private ToggleButton leftEngineToggleButton;
    @FXML private ToggleButton rightEngineToggleButton;
    @FXML private ToggleButton leftEngineErrorToggleButton;
    @FXML private ToggleButton rightEngineErrorToggleButton;

    private static Logger LOGGER;

    static {
        try (InputStream stream = SSJMainController.class
                .getClassLoader()
                .getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(stream);
            LOGGER = Logger.getLogger(SSJMainController.class.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onActionActivateLeftEngine(ActionEvent actionEvent) {
        if (leftEngineToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateLeftEngine();
        } else {
            if (leftEngineErrorToggleButton.isSelected()) {
                leftEngineErrorToggleButton.setSelected(false);
                fxidBottomInfoPaneController.deactivateErrorLeftEngine();
            }

            fxidBottomInfoPaneController.deactivateLeftEngine();
        }
    }

    public void onActionActivateRightEngine(ActionEvent actionEvent) {
        if (rightEngineToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateRightEngine();
        } else {
            if (rightEngineErrorToggleButton.isSelected()) {
                rightEngineErrorToggleButton.setSelected(false);
                fxidBottomInfoPaneController.deactivateErrorRightEngine();
            }

            fxidBottomInfoPaneController.deactivateRightEngine();
        }
    }

    public void onActionErrorLeftEngine(ActionEvent actionEvent) {
        if (leftEngineToggleButton.isSelected() && leftEngineErrorToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateErrorLeftEngine();
        } else if (!leftEngineToggleButton.isSelected()) {
            leftEngineErrorToggleButton.setSelected(false);
            LOGGER.log(Level.INFO, "Left engine must be active");
        } else {
            fxidBottomInfoPaneController.deactivateErrorLeftEngine();
        }
    }

    public void onActionErrorRightEngine(ActionEvent actionEvent) {
        if (rightEngineToggleButton.isSelected() && rightEngineErrorToggleButton.isSelected()) {
            fxidBottomInfoPaneController.activateErrorRightEngine();
        } else if (!rightEngineToggleButton.isSelected()) {
            rightEngineErrorToggleButton.setSelected(false);
            LOGGER.log(Level.INFO, "Right engine must be active");
        } else {
            fxidBottomInfoPaneController.deactivateErrorRightEngine();
        }
    }
}
