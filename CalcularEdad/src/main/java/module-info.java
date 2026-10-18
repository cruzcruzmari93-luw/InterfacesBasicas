module mccruz.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.calcularedad to javafx.fxml;
    exports mccruz.calcularedad;
}
