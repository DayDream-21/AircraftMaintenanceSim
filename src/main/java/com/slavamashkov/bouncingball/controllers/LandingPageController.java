package com.slavamashkov.bouncingball.controllers;

import com.slavamashkov.bouncingball.SSJApplication;
import com.slavamashkov.bouncingball.errors.*;
import com.slavamashkov.bouncingball.errors.Error;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LandingPageController implements Controller, Initializable {
    @FXML private ComboBox<Error> comboBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().addAll(
                new Error1(),
                new Error2(),
                new Error3()
        );

        comboBox.setVisibleRowCount(10);
    }

    public void switchToSceneTwo(MouseEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(SSJApplication.class.getResource("refactor2/master-pane.fxml"));
        Parent root = fxmlLoader.load();

        MasterPaneController controller = fxmlLoader.getController();
        controller.receiveData(comboBox.getValue());

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
