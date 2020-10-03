package autopartes.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class ControllerMenuPrincipal {
    public Label labelTitulo;
    public Label etiquetaClientes;
    public CheckBox checkboxCIndi;
    public CheckBox checkboxCEmpresa;
    public Label labelNombre;
    public Label labelDPI;
    public Label labelContacto;
    public Label labelDireccion;
    public Label labelDescuento;
    public TextField textNombre;
    public TextField textDPI;
    public TextField textContacto;
    public TextField textDireccion;
    public TextField textDescuento;
    public Label labelPorciento;
    public Button botonGuardar;


    public ControllerMenuPrincipal(){
    }

    public void vermenuProductos(ActionEvent actionEvent) {

    }

    public void vermenuClientes(ActionEvent actionEvent) {
    checkboxCIndi.setVisible(true);
    checkboxCEmpresa.setVisible(true);
    labelTitulo.setVisible(true);
    etiquetaClientes.setVisible(true);

    }
    public void nuevoCliente(ActionEvent actionEvent){
        checkboxCEmpresa.setDisable(true);
        labelNombre.setVisible(true);
        textNombre.setVisible(true);
        labelDireccion.setVisible(true);
        textDireccion.setVisible(true);
        botonGuardar.setVisible(true);
        textDPI.setVisible(true);
        labelDPI.setVisible(true);
    }
    public void nuevaEmpresa(ActionEvent actionEvent){
        checkboxCIndi.setDisable(true);
        labelDescuento.setVisible(true);
        labelNombre.setVisible(true);
        textNombre.setVisible(true);
        labelDireccion.setVisible(true);
        textDireccion.setVisible(true);
         textDescuento.setVisible(true);
        labelPorciento.setVisible(true);
        botonGuardar.setVisible(true);
        labelContacto.setVisible(true);
        textContacto.setVisible(true);
    }

}

