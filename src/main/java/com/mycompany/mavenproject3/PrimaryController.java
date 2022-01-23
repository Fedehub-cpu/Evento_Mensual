package com.mycompany.mavenproject3;

import java.io.IOException;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button btnReservar;
    @FXML
    private Button btnCancelar;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtApellido2;
    @FXML
    private TextField txtEmpresa;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtAcompañante;
    @FXML
    private TextArea txtObservacion;
    @FXML
    private Label info;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void reservar(ActionEvent event) {
         String email = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
        
         if(txtNombre.getText().length()==0){
            
     info.setText("Introduzca el nombre");
     info.setStyle("-fx-background-color:red");
}
        else if (txtApellido.getText().length()==0)   {          
    info.setText("Introduzca su primer apellido");
    info.setStyle("-fx-background-color:red");       
}
  
        else if (txtApellido2.getText().length()==0) {
    info.setText("Introduzca su segundo apellido");
    info.setStyle("-fx-background-color:red");      
}
        else if (txtEmpresa.getText().length()==0) {
    info.setText("Introduzca la empresa para la que trabaja");
    info.setStyle("-fx-background-color:red");  
}
        
        else if (txtCorreo.getText().length()==0) {
    info.setText("Introduzca su correo electrónico");
    info.setStyle("-fx-background-color:red");  
}
        else if (!Pattern.matches(email, txtCorreo.getText())) {
    info.setText("Introduzca su correo electrónico correctamente");
    info.setStyle("-fx-background-color:red");  
}

        else if (txtAcompañante.getText().length()==0) {
    info.setText("Introduzca su acompañante/es");
    info.setStyle("-fx-background-color:red");
}
        else if (txtObservacion.getText().length()==0) {
    info.setText("Introduzca su observación");
    info.setStyle("-fx-background-color:red");
}   
        else   {
    info.setText("Se ha solicitado correctamente la reserva");
    info.setStyle("-fx-background-color:green");
}
        
       
        
    }

    @FXML
    private void cancelar(ActionEvent event) {
    }

   
}
