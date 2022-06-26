package com.slavamashkov.bouncingball;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

public class RotationController {
    private static Logger LOGGER;

    static {
        try (InputStream stream = RotationController.class
                .getClassLoader()
                .getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(stream);
            LOGGER = Logger.getLogger(RotationController.class.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private Label label;
    @FXML private TextField textField;
    @FXML private Group rotatingGroup;

    public void onPressRotateCircleLeft(ActionEvent actionEvent) {
        double rotation = Double.parseDouble(textField.getText());

        LOGGER.log(Level.INFO, "rotation right by " + rotation + " degree");

        rotatingGroup.setRotate(rotatingGroup.getRotate() - rotation);
        label.setText(String.valueOf(rotatingGroup.getRotate()));
    }

    public void onPressRotateCircleRight(ActionEvent actionEvent) {
        double rotation = Double.parseDouble(textField.getText());

        LOGGER.log(Level.INFO, "rotation right by " + rotation + " degree");

        rotatingGroup.setRotate(rotatingGroup.getRotate() + rotation);
        label.setText(String.valueOf(rotatingGroup.getRotate()));
    }

    public void onActionIncreaseNumberByOne(ActionEvent actionEvent) {
        textField.setText(String.valueOf(Integer.parseInt(textField.getText()) + 1));
    }

    public void onActionDecreaseNumberByOne(ActionEvent actionEvent) {
        int number = Integer.parseInt(textField.getText()) - 1;

        if (number > 0) {
            textField.setText(String.valueOf(number));
        }
    }
}
