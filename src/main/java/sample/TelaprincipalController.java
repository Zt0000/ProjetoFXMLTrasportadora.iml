package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaprincipalController {
    public void btnewficha(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Criacaoficha.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("20 Dice");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow() );
        stage.show();
    }

    public void btsair(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
}
