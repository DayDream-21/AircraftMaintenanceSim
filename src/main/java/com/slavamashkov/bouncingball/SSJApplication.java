package com.slavamashkov.bouncingball;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 03.09.22 1224 строчки
 */

public class SSJApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(SSJApplication.class.getResource("refactor2/master-pane.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            stage.setResizable(false);
            stage.setTitle("SSJ-100");
            stage.getIcons().add(new Image("E:\\SSJ\\Pictures\\ssj100logo.png"));
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
}