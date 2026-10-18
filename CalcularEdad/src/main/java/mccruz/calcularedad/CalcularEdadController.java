package mccruz.calcularedad;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.Period;

public class CalcularEdadController {
    @FXML
    private TextField fecha;
    @FXML
    private Label resultado;

    @FXML
    private void calcularEdad() {
        try {
            LocalDate nacimiento = LocalDate.parse(fecha.getText());
            LocalDate hoy = LocalDate.now();
            int edad = Period.between(nacimiento, hoy).getYears();
            resultado.setText("Edad: " + edad + " años");
        } catch (Exception e) {
            resultado.setText("Formato inválido (usa YYYY-MM-DD)");
        }
    }
    
    @FXML
    private void limpiarCampo() {
        fecha.clear();
        resultado.setText("");
    }
}