package autopartes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;

public class ControllerLogin {

    public TextField txtUsuario;
    public PasswordField txtContrasena;

    public void logear(ActionEvent actionEvent) throws IOException {

        if(((txtUsuario.getText().equals("kcruzs") )&&( txtContrasena.getText().equals("123456")))){

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/autopartes/views/MenuPrincipal.fxml"));
                Pane root = (Pane) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("EMPRESA AUTOPARTES S.A");
                stage.setScene(new Scene(root, 600, 500));
                stage.show();

                //cerrar el login
                // get a handle to the stage
                Stage stage2 = (Stage) txtUsuario.getScene().getWindow();
                // do what you have to do
                stage2.close();

        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña INCORRECTO");
        }

    }
}