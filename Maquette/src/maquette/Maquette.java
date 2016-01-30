package maquette;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Maquette extends Application {

    private static Stage stage;
    private static Scene menu;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        VBox root = new VBox();
        Button btn;

        btn = createButton("Commandes", "view/CommandeView.fxml");
        root.getChildren().add(btn);

        btn = createButton("Réapprovisionnement", "view/ApprovisionnementView.fxml");
        root.getChildren().add(btn);

        btn = createButton("Facturation", "view/FacturationView.fxml");
        root.getChildren().add(btn);

        btn = createButton("Avoirs", "view/AvoirView.fxml");
        root.getChildren().add(btn);

        btn = createButton("Fournisseurs", "view/FournisseurView.fxml");
        root.getChildren().add(btn);

        btn = createButton("Clients", "view/ClientView.fxml");
        root.getChildren().add(btn);

        menu = new Scene(root);

        stage.setTitle("Saveurs de nos provinces");
        stage.setScene(menu);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Button createButton(String name, String relativePath) {
        Button btn = new Button();
        btn.setText(name);
        btn.setOnAction((ActionEvent event) -> {
            loadView(relativePath);
        });
        return btn;
    }

    private void loadView(String relativePath) {
        try {
            Parent FXMLView = FXMLLoader.load(getClass().getResource(relativePath));
            goToWindow(FXMLView);
        } catch (IOException ex) {
            Logger.getLogger(Maquette.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void goToWindow(Parent FXMLView) {
        Scene scene = new Scene(FXMLView);
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }

    public static void message(final String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Information");
        alert.setContentText(content);
        alert.showAndWait();
    }

}
