package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import static com.slavamashkov.bouncingball.enums.Color.*;

public class ElecUnitsController {
    @FXML private Rectangle leftDriveConnection;
    @FXML private Circle leftDriveTransformerCircle;
    @FXML private Rectangle leftDriveRectangle;
    @FXML private CubicCurve leftDriveTransformerSign;
    @FXML private Rectangle rightDriveConnection;
    @FXML private Circle rightDriveTransformerCircle;
    @FXML private Rectangle rightDriveRectangle;
    @FXML private CubicCurve rightDriveTransformerSign;

    public void activateLeftEngine() {
        leftDriveConnection.setOpacity(1.0);
        leftDriveTransformerSign.setOpacity(1.0);
        leftDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        leftDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        leftDriveRectangle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
    }

    public void deactivateLeftEngine() {
        leftDriveConnection.setOpacity(0.0);
        leftDriveTransformerSign.setOpacity(0.0);
        leftDriveTransformerCircle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
        leftDriveRectangle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
    }

    public void activateRightEngine() {
        rightDriveConnection.setOpacity(1.0);
        rightDriveTransformerSign.setOpacity(1.0);
        rightDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        rightDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        rightDriveRectangle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
    }

    public void deactivateRightEngine() {
        rightDriveConnection.setOpacity(0.0);
        rightDriveTransformerSign.setOpacity(0.0);
        rightDriveTransformerCircle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
        rightDriveRectangle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
    }

    public void activateErrorLeftEngine() {
        leftDriveTransformerCircle.setStroke(Color.web(ERROR_COLOR.hexCode));
        leftDriveTransformerSign.setStroke(Color.web(ERROR_COLOR.hexCode));
    }

    public void deactivateErrorLeftEngine() {
        leftDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        leftDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
    }

    public void activateErrorRightEngine() {
        rightDriveTransformerCircle.setStroke(Color.web(ERROR_COLOR.hexCode));
        rightDriveTransformerSign.setStroke(Color.web(ERROR_COLOR.hexCode));
    }

    public void deactivateErrorRightEngine() {
        rightDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        rightDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
    }


}
