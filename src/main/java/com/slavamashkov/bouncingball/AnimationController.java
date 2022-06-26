package com.slavamashkov.bouncingball;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class AnimationController {
    @FXML private Button startButton;
    @FXML private Label voltage;


    public void onActionIncreaseVoltage() {
        Timeline timeline = new Timeline();

        KeyFrame keyFrame = new KeyFrame(
                Duration.seconds(1),
                event -> {
                    double currentVoltage = Double.parseDouble(voltage.getText());
                    if (currentVoltage == 100) {
                        timeline.stop();
                    } else {
                        currentVoltage += 10;
                        voltage.setText(String.valueOf(currentVoltage));
                    }
                }
        );

        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
