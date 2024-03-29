package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreateAccountController {
    public void backOnClick(ActionEvent e) throws Exception {
        Parent loginRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Login.fxml"));
        Scene loginScene = new Scene(loginRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }

    public void CreateAccountOnClick(ActionEvent e) throws Exception {
        Parent createAccountRoot = FXMLLoader.load(getClass().getResource("../../resources/view/AccountPayment.fxml"));
        Scene createAccountScene = new Scene(createAccountRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(createAccountScene);
        window.show();
    }
}
