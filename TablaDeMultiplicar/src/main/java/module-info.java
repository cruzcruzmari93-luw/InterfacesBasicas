module mccruz.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.tablademultiplicar to javafx.fxml;
    exports mccruz.tablademultiplicar;
}
