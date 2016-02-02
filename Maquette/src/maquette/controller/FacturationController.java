package maquette.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import maquette.Maquette;

public class FacturationController implements Initializable {
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;
    @FXML
    private ComboBox<String> cmbCommande;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbCommande.getItems().addAll("#978", "#602", "#1057", "#2016");
    }    

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);

    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
        String s;
        double r;
        switch(cmbCommande.getValue()){
            case "#978": s="Relou"; r = 0.00 ; break;
            case "#602":s="M.Propre"; r = 0.05 ;break;
            case "#1057" : s="Challenger";r = 0.10;break;
            case "#2016" : s="Radin";r = 0.15;break;
                default :
                return;
        }
        int c = (int) (Math.random() * 100000);
        Maquette.message(s+"\nAvant remise : "+c+" €\nAprès remise : "+Integer.toString((int) (c * (1-r)))+" € (remise de "+(int)(r*100)+" %)");
        Maquette.message("Envoie de la facture...");
    }
    
}
