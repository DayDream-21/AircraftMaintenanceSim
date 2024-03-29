package com.slavamashkov.bouncingball.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import static com.slavamashkov.bouncingball.enums.Color.*;

public class ElecUnitsController implements Controller {
    // Left Engine
    @FXML private Rectangle leftDriveConnection;
    @FXML private Circle leftDriveTransformerCircle;
    @FXML private CubicCurve leftDriveTransformerSign;
    @FXML private Rectangle leftDriveRectangle;

    // Right Engine
    @FXML private Rectangle rightDriveConnection;
    @FXML private Circle rightDriveTransformerCircle;
    @FXML private Rectangle rightDriveRectangle;
    @FXML private CubicCurve rightDriveTransformerSign;

    // External Power
    @FXML private Rectangle extPwrRectangle;
    @FXML private CubicCurve extPwrTransformerSign;
    @FXML private Label extLabel;
    @FXML private Label pwrLabel;
    @FXML private Label extPwrVoltageValue;
    @FXML private Label extPwrVoltageSign;
    @FXML private Label extPwrFrequencyValue;
    @FXML private Label extPwrFrequencySign;

    private static ElecUnitsController instance;

    public ElecUnitsController() {
        instance = this;
    }

    public static ElecUnitsController getInstance() {
        return instance;
    }

    public void activateExtPwr() {
        extPwrRectangle.setOpacity(1.0);
        extPwrTransformerSign.setOpacity(1.0);
        extLabel.setOpacity(1.0);
        pwrLabel.setOpacity(1.0);
        extPwrVoltageValue.setOpacity(1.0);
        extPwrVoltageSign.setOpacity(1.0);
        extPwrFrequencyValue.setOpacity(1.0);
        extPwrFrequencySign.setOpacity(1.0);

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.activateAllBatsDemo();
    }

    public void deactivateExtPwr() {
        extPwrRectangle.setOpacity(0.0);
        extPwrTransformerSign.setOpacity(0.0);
        extLabel.setOpacity(0.0);
        pwrLabel.setOpacity(0.0);
        extPwrVoltageValue.setOpacity(0.0);
        extPwrVoltageSign.setOpacity(0.0);
        extPwrFrequencyValue.setOpacity(0.0);
        extPwrFrequencySign.setOpacity(0.0);

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.deactivateAllBatsDemo();
    }

    public void activateLeftEngine() {
        leftDriveConnection.setOpacity(1.0);
        leftDriveTransformerSign.setOpacity(1.0);
        leftDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        leftDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        leftDriveRectangle.setStroke(Color.web(ACTIVE_COLOR.hexCode));

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.activateAllBatsDemo();
    }

    public void deactivateLeftEngine() {
        leftDriveConnection.setOpacity(0.0);
        leftDriveTransformerSign.setOpacity(0.0);
        leftDriveTransformerCircle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
        leftDriveRectangle.setStroke(Color.web(INACTIVE_COLOR.hexCode));

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.deactivateAllBatsDemo();
    }

    public void activateRightEngine() {
        rightDriveConnection.setOpacity(1.0);
        rightDriveTransformerSign.setOpacity(1.0);
        rightDriveTransformerSign.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        rightDriveTransformerCircle.setStroke(Color.web(ACTIVE_COLOR.hexCode));
        rightDriveRectangle.setStroke(Color.web(ACTIVE_COLOR.hexCode));

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.activateAllBatsDemo();
    }

    public void deactivateRightEngine() {
        rightDriveConnection.setOpacity(0.0);
        rightDriveTransformerSign.setOpacity(0.0);
        rightDriveTransformerCircle.setStroke(Color.web(INACTIVE_COLOR.hexCode));
        rightDriveRectangle.setStroke(Color.web(INACTIVE_COLOR.hexCode));

        UpperInfoPaneController controller = UpperInfoPaneController.getInstance();
        controller.deactivateAllBatsDemo();
    }

    /*public void activateErrorLeftEngine() {
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
    }*/
}