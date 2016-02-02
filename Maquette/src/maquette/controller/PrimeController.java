package maquette.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import maquette.Maquette;

public class PrimeController implements Initializable {

    @FXML
    private ComboBox<String> cmbCommercial;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbCommercial.getItems().addAll("Quentin Chauvel", "David Clément", "Valentin Lesieur");
    }

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);

    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
        switch (cmbCommercial.getValue()) {
            case "Quentin Chauvel":
            case "David Clément":
            case "Valentin Lesieur":
                Maquette.message(Integer.toString((int) (Math.random() * 10000))+" €");
            default :
                break;
        }
    }

}
