package mccruz.divisoresnumero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DivisoresNumeroController {
    @FXML private TextField numero;
    @FXML private Label lblCifras, lblSumaImpares, lblSumaPares, lblSumaTotal, lblMayor, lblMenor;
    @FXML private ListView<Integer> listaDivisores;

    @FXML
    private void analizarNumero() {
        int n = Integer.parseInt(numero.getText());
        String numStr = String.valueOf(n);

        lblCifras.setText(String.valueOf(numStr.length()));

        int sumaImpares = 0, sumaPares = 0;
        int mayor = 0, menor = 9;

        for (char c : numStr.toCharArray()) {
            int digito = c - '0';
            if (digito % 2 == 0) sumaPares += digito;
            else sumaImpares += digito;

            if (digito > mayor) mayor = digito;
            if (digito < menor) menor = digito;
        }

        lblSumaImpares.setText(String.valueOf(sumaImpares));
        lblSumaPares.setText(String.valueOf(sumaPares));
        lblSumaTotal.setText(String.valueOf(sumaImpares + sumaPares));
        lblMayor.setText(String.valueOf(mayor));
        lblMenor.setText(String.valueOf(menor));

        listaDivisores.getItems().clear();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) listaDivisores.getItems().add(i);
        }
    }

    @FXML
    private void limpiarCampo() {
        numero.clear();
        lblCifras.setText("");
        lblSumaImpares.setText("");
        lblSumaPares.setText("");
        lblSumaTotal.setText("");
        lblMayor.setText("");
        lblMenor.setText("");
        listaDivisores.getItems().clear();
    }

}