package sample.controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import sample.modelos.Persona;

public class Controller {

    public TextField txtNombre;
    public CheckBox btnNombre;
    public CheckBox btnApellido;

    public void realizarBusqueda(KeyEvent keyEvent) {

        int campoBuscar = 0;
        if (btnNombre.isSelected() && btnApellido.isSelected()) {
            if (!Persona.buscarPorPartes(txtNombre.getText())){
                System.out.println("No se encontro ningun registro");
            }

        } else {
            if (!btnNombre.isSelected()) {
                Persona.buscarPorParte(txtNombre.getText(), campoBuscar);
            }
            if (btnApellido.isSelected()) {
                campoBuscar = 1;
                Persona.buscarPorParte(txtNombre.getText(), campoBuscar);
            }
        }


    }



}
