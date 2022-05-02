module com.slavamashkov.bouncingball {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.slavamashkov.bouncingball to javafx.fxml;
    exports com.slavamashkov.bouncingball;
}