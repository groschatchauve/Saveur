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

public class ApprovisionnementController implements Initializable {

    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;
    @FXML
    private ComboBox<String> cmbFournisseur;
    @FXML
    private ComboBox<String> cmbProduit;
    @FXML
    private TextField txtQuantite;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbFournisseur.getItems().addAll("Marché Noir", "Fournis Tout", "SuperFour");
        cmbProduit.getItems().addAll("sel","poivre","sucre","safran","eau");

    }

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);
    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
        String q = txtQuantite.getText();
        String p = cmbProduit.getValue();
        String f = cmbFournisseur.getValue();
        if (q.matches("[0-9]*") && !p.equals("Produit") && !f.equals("Client")) {
            Maquette.message(p + " (x" + q + ") commandé au fournisseur " + f);
        }
    }

}
