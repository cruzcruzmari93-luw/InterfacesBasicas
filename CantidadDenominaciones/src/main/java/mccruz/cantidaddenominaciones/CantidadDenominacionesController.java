package mccruz.cantidaddenominaciones;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CantidadDenominacionesController {
    @FXML
    private TextField dinero;
    @FXML
    private TableView<Denominacion> tablaResultados;
    @FXML
    private TableColumn<Denominacion, String> colDenominacion;
    @FXML
    private TableColumn<Denominacion, Integer> colCantidad;

    @FXML
    private void initialize() {
        colDenominacion.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
    }
    
    @FXML
    private void desglosarDinero() {
        int cantidad = Integer.parseInt(dinero.getText());
        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        ObservableList<Denominacion> lista = FXCollections.observableArrayList();

        for (int d : denominaciones) {
            int num = cantidad / d;
            cantidad = cantidad % d;
            lista.add(new Denominacion("$" + d, num));
        }

        tablaResultados.setItems(lista);
    }

    @FXML
    private void limpiarCampo() {
        dinero.clear();
        tablaResultados.getItems().clear();
    }   
}