module mccruz.cantidaddenominaciones {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.cantidaddenominaciones to javafx.fxml;
    exports mccruz.cantidaddenominaciones;
}
