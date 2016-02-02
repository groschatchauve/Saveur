package maquette.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import maquette.Maquette;

public class AvoirController implements Initializable {

    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;
    @FXML
    private ComboBox<String> cmbClient;
    @FXML
    private TextField txtMontant;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbClient.getItems().setAll("Alpha", "Bravo", "Charlie", "Delta", "Foxtrot");
    }

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);

    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
        Maquette.message(cmbClient.getValue() + " dispose désormais d'un avoir de " + txtMontant.getText() + " €");
    }

}
