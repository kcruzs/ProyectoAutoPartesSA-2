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
    public Label labelTitulo, etiquetaClientes,labelNombre, labelDPI, labelContacto, labelDireccion, labelDescuento,labelPorciento,etiquetaProductos,labelCodProducto;
    public CheckBox checkboxCIndi, checkboxCEmpresa;
    public TextField textNombre, textDPI,textContacto,textDireccion, textDescuento,textCodProducto;
    public Button botonGuardar, botonGuardarProducto, botonGuardarEmpresa;
    public Label labelNombreProducto;
    public TextField textNombreProducto;
    public Label labelPrecio;
    public TextField textPrecio;
    public Label labelExistencia;
    public TextField textExistencia;

    public ControllerMenuPrincipal(){
    }

    public void vermenuProducto(ActionEvent actionEvent) {
        labelTitulo.setVisible(true);
        etiquetaProductos.setVisible(true);
        labelCodProducto.setVisible(true);
        textCodProducto.setVisible(true);
        labelNombreProducto.setVisible(true);
        textNombreProducto.setVisible(true);
        labelPrecio.setVisible(true);
        textPrecio.setVisible(true);
        labelExistencia.setVisible(true);
        textExistencia.setVisible(true);
        botonGuardarProducto.setVisible(true);
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
        botonGuardarEmpresa.setVisible(true);
        labelContacto.setVisible(true);
        textContacto.setVisible(true);
    }

}

