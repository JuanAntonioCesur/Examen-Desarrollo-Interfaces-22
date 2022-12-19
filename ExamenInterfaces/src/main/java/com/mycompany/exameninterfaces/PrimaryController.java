/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.exameninterfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author yuan-
 */
public class PrimaryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField tfNombre;
    
    @FXML
    private ComboBox<String> cbSexo;
    
    @FXML
    private ComboBox<String>cbActividad;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
        cbSexo.getItems().clear();
        cbSexo.getItems().addAll("Hombre","Mujer");
        
        cbActividad.getItems().clear();
        cbActividad.getItems().addAll("Muy ligera","Ligera","Moderada","Intensa");
        
    }    
    
}
