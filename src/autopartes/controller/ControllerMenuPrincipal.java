package autopartes.controller;

import autopartes.modelo.DataSistema;
import autopartes.modelo.Individual;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.persistence.Table;
import javax.swing.*;


public class ControllerMenuPrincipal {
    public Label labelTitulo, etiquetaClientes,labelNombre, labelDPI, labelContacto, labelDireccion, labelDescuento,labelPorciento,etiquetaProductos,labelCodProducto;
    public CheckBox checkboxCIndi, checkboxCEmpresa;
    public TextField textNombre, textDPI,textContacto,textDireccion, textDescuento,textCodProducto,textNombreProducto;
    public Button botonGuardar, botonGuardarProducto, botonGuardarEmpresa,bottonLimpia;
    public Label labelPrecio,labelExistencia,labelNombreProducto;
    public TextField textPrecio, textExistencia;

    public Label labelTituloInventarios,labelTituloAcerca;
    public TableView tablaClienteIndividual,tablaClienteEmpresa,tablaInventarios;
    public CheckBox checkClienteIndividual,checkClienteEmpresa;
    public DataSistema basedatos;

    public ControllerMenuPrincipal(){
        basedatos =new DataSistema();
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
        bottonLimpia.setVisible(true);
    }

    public void vermenuClientes(ActionEvent actionEvent) {
    checkboxCIndi.setVisible(true);
    checkboxCEmpresa.setVisible(true);
    labelTitulo.setVisible(true);
    etiquetaClientes.setVisible(true);
        bottonLimpia.setVisible(true);

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
        bottonLimpia.setVisible(true);
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
        bottonLimpia.setVisible(true);
    }

    public void verInventariosClientes(){
        labelTituloInventarios.setVisible(true);
        checkClienteIndividual.setVisible(true);
        checkClienteEmpresa.setVisible(true);
        bottonLimpia.setVisible(true);

    }

    public void verClientesIndividuales(){
        tablaClienteIndividual.setVisible(true);
        checkClienteEmpresa.setDisable(true);
        bottonLimpia.setVisible(true);
    }

    public void verClientesEmpresa(){
        checkClienteIndividual.setDisable(true);
        tablaClienteEmpresa.setVisible(true);
        bottonLimpia.setVisible(true);
    }

    public void verInventarioProductos(){
        tablaInventarios.setVisible(true);
        bottonLimpia.setVisible(true);
    }
    public void Limpiatodo(){
        labelTitulo.setVisible(false);
        etiquetaClientes.setVisible(false);
        labelNombre.setVisible(false);
        labelDPI.setVisible(false);
        labelContacto.setVisible(false);
        labelDireccion.setVisible(false);
        labelDescuento.setVisible(false);
        labelPorciento.setVisible(false);
        etiquetaProductos.setVisible(false);
        labelCodProducto.setVisible(false);
        checkboxCIndi.setVisible(false);
        checkboxCIndi.setDisable(false);
        checkboxCEmpresa.setDisable(false);
        checkboxCEmpresa.setVisible(false);
        textNombre.setVisible(false);
        textDPI.setVisible(false);
        textContacto.setVisible(false);
        textDireccion.setVisible(false);
        textDescuento.setVisible(false);
        textCodProducto.setVisible(false);
        textNombreProducto.setVisible(false);
        botonGuardar.setVisible(false);
        botonGuardarProducto.setVisible(false);
        botonGuardarEmpresa.setVisible(false);
        labelPrecio.setVisible(false);
        labelExistencia.setVisible(false);
        labelNombreProducto.setVisible(false);
        textPrecio.setVisible(false);
        textExistencia.setVisible(false);
        labelTituloInventarios.setVisible(false);
        tablaClienteIndividual.setVisible(false);
        tablaClienteEmpresa.setVisible(false);
        tablaInventarios.setVisible(false);
        checkClienteIndividual.setVisible(false);
        checkClienteEmpresa.setVisible(false);
        checkClienteIndividual.setDisable(false);
        checkClienteEmpresa.setDisable(false);
        checkClienteIndividual.setSelected(false);
        checkClienteEmpresa.setSelected(false);
        checkboxCIndi.setSelected(false);
        checkboxCEmpresa.setSelected(false);
        bottonLimpia.setVisible(false);
        labelTituloAcerca.setVisible(false);
    }
    public void verMenuAcerca(){
        labelTituloAcerca.setVisible(true);
        bottonLimpia.setVisible(true);
    }


    public void addCliente(){

        Individual c1 =new Individual(Integer.parseInt(textDPI.getText()));
        c1.setNombre(textNombre.getText());
        c1.setDireccion(textDireccion.getText());
        basedatos.agregarCliente(c1);
    }

}

