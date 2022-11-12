package com.slavamashkov.bouncingball.controllers;

import com.slavamashkov.bouncingball.SSJApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;

public class ElecScreenController implements Controller {
    // All controllers taken from FXML files have "fxid" prefix
    @FXML private UpperInfoPaneController fxidUpperInfoPaneController;
    @FXML private MiddleInfoPaneController fxidMiddleInfoPaneController;
    @FXML private BottomInfoPaneController fxidBottomInfoPaneController;

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

    public void switchToSceneOne(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(SSJApplication.class.getResource("landing-page.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}