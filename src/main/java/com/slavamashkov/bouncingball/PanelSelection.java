package com.slavamashkov.bouncingball;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PanelSelection {
    @FXML private Rectangle elecPanelChoice;

    public void glowOn(MouseEvent mouseEvent) {
        elecPanelChoice.setOpacity(1.0);
        System.out.println("Mouse entered");
    }

    public void glowOff(MouseEvent mouseEvent) {
        elecPanelChoice.setOpacity(0.0);
        System.out.println("Mouse exited");
    }
}
