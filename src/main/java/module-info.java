module com.slavamashkov.bouncingball {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens com.slavamashkov.bouncingball to javafx.fxml;
    exports com.slavamashkov.bouncingball;

    exports com.slavamashkov.bouncingball.controllers;
    opens com.slavamashkov.bouncingball.controllers to javafx.fxml;

    exports com.slavamashkov.bouncingball.enums;
    opens com.slavamashkov.bouncingball.enums to javafx.fxml;
}