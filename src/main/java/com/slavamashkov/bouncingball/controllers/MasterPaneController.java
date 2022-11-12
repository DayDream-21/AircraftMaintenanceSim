package com.slavamashkov.bouncingball.controllers;

import com.slavamashkov.bouncingball.errors.*;
import com.slavamashkov.bouncingball.errors.Error;
import javafx.scene.paint.Paint;

import java.util.Map;

public class MasterPaneController implements Controller {
    public void receiveData(Error error) {
        MiddleInfoPaneController controller = MiddleInfoPaneController.getInstance();
        Error1 error1 = (Error1) error;

        controller.leftMainBusDC.setStroke(
                Paint.valueOf(error1.parameters.get("leftMainBusDC").get(0).getFxValue())
        );
        controller.rightEmrgBusDC.setStroke(
                Paint.valueOf(error1.parameters.get("rightEmrgBusDC").get(0).getFxValue())
        );
    }
}