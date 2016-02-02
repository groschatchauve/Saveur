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

public class FournisseurController implements Initializable {
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtAdresse;
    @FXML
    private ComboBox<String> txtMatiere;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtMatiere.getItems().addAll("sel","poivre","sucre","safran","eau");
    }    

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);
    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
    }
    
}
