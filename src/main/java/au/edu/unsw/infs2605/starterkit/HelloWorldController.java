/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.starterkit;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author chris
 */
public class HelloWorldController {
    
    @FXML
    private Button btnGoToCalculator;
    
    @FXML
    private void openCalculator() throws IOException {
        App.setRoot("CalculatorAbridged");
    }
    
//    @FXML
//    public void openCalculator(ActionEvent event) throws IOException {
//        App.setRoot("CalculatorAbridged");
//    }
    
//    @FXML
//    private void goToCalculator() throws IOException {
//        
//    }
//    
}
