module mccruz.divisoresnumero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.divisoresnumero to javafx.fxml;
    exports mccruz.divisoresnumero;
}
