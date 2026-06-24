package com.veterinario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class VeterinarioController {

    @FXML
    private TextField txtNombreMascota;

    @FXML
    private TextField txtTipoMascota;

    @FXML
    private TextField txtRaza;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombreDueno;

    @FXML
    private TextField txtMotivoVisita;

    @FXML
    private void registrar(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro de Paciente");
        alert.setHeaderText(null);
        alert.setContentText("La visita del paciente fue registrada correctamente");
        alert.showAndWait();
    }

    @FXML
    private void limpiar(ActionEvent event){
        txtNombreMascota.clear();
        txtTipoMascota.clear();
        txtRaza.clear();
        txtEdad.clear();
        txtNombreDueno.clear();
        txtMotivoVisita.clear();
    }
}