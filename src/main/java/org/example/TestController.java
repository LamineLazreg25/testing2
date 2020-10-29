package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class TestController {
    @FXML
    TextField UserName;
    @FXML
    PasswordField Password;



    @FXML
    private void switchToPrimary2() throws IOException {
        if(UserName.getText().toString().equals("Lamine") && Password.getText() .toString().equals("21071994") ){

            System.out.println(UserName.getText());
            App.setRoot("primary");
        }

        System.out.println(Password.getText());
    }
}
