package mccruz.tablademultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TablaMultiplicarController {
    @FXML private TextField numero;
    @FXML private TextArea resultado;

    @FXML
    private void calcularTabla() {
        int n = Integer.parseInt(numero.getText());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb.append(n + " × " + i + " = " + (n * i) + "\n");
        }

        resultado.setText(sb.toString());
    }

    @FXML
    private void limpiarCampo() {
        numero.clear();
        resultado.clear();
    }
}