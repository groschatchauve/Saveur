package maquette.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import maquette.Maquette;

public class ClientController implements Initializable {
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnOk;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnCancel_OnAction(ActionEvent event) {
        Maquette.stage.setScene(Maquette.menu);
    }

    @FXML
    private void btnOk_OnAction(ActionEvent event) {
    }   
    
}
