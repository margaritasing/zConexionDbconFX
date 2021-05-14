package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML private void guardar(){
        System.out.println("estoy guardando");
    }

    @FXML private void enviar(){
        System.out.println("estoy enviando");
    }
}