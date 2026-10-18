package mccruz.gastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GastosSemanalesController {
    @FXML private TextField txtAlimentacion, txtRefrigerios, txtTransporte, txtTelefonia, txtOtros;
    @FXML private Label lblTotal, lblMayor;

    @FXML
    private void calcularEstadisticas() {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios + transporte + telefonia + otros;
        lblTotal.setText(String.valueOf(total));

        int mayor = alimentacion;
        String categoria = "Alimentación";

        if (refrigerios > mayor) { mayor = refrigerios; categoria = "Refrigerios"; }
        if (transporte > mayor) { mayor = transporte; categoria = "Transporte"; }
        if (telefonia > mayor) { mayor = telefonia; categoria = "Telefonía"; }
        if (otros > mayor) { mayor = otros; categoria = "Otros"; }

        lblMayor.setText(categoria);
    }

    @FXML
    private void limpiarCampo() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        lblTotal.setText("");
        lblMayor.setText("");
    }
}
