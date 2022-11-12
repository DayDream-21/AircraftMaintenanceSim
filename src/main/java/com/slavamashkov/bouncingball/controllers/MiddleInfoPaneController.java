package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class MiddleInfoPaneController implements Controller {
    @FXML Rectangle leftMainBusDC;
    @FXML Rectangle rightEmrgBusDC;

    private static MiddleInfoPaneController instance;

    public MiddleInfoPaneController() {
        instance = this;
    }

    public static MiddleInfoPaneController getInstance() {
        return instance;
    }
}
