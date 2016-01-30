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

public class CommandeController implements Initializable {
    @FXML
    private ComboBox<String> cmbClient;
    @FXML
    private ComboBox<String> cmbProduit;
    @FXML
    private TextField txtQuantite;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbClient.getItems().setAll("Alpha","Bravo", "Charlie", "Delta", "Foxtrot");
        cmbProduit.getItems().setAll("foie gras", "caviar", "truffe", "macaron", "homard");
    }    

    @FXML
    private void cmbClient_OnAction(ActionEvent event) {
        
    }

    @FXML
    private void cmbProduit_OnAction(ActionEvent event) {
    }

    @FXML
    private void txtQuantite_OnAction(ActionEvent event) {
    }

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
        String q = txtQuantite.getText();
        String p = cmbProduit.getValue();
        String c = cmbClient.getValue();
        if(q.matches("[0-9]*") && !p.equals("Produit") && !c.equals("Client"))
            Maquette.message(p+" (x"+q+") commandé pour le client "+ c);
    }
    
    
}
