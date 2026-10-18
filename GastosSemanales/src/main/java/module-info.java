module mccruz.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.gastossemanales to javafx.fxml;
    exports mccruz.gastossemanales;
}
