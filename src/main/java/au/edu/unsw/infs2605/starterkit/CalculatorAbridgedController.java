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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 *
 * @author chris
 */
public class CalculatorAbridgedController {
    
    @FXML
    private TextField tfNumberOne;
    
    @FXML
    private TextField tfNumberTwo;
    
    @FXML
    private Button btnAdd;
    
    @FXML
    private Button btnSubtract;
    
    @FXML
    private Button btnMultiply;
    
    @FXML
    private Button btnDivide;

    @FXML
    private Label lblResult;
    
    double numberOne;
    double numberTwo;
    String operator;
    double result;
    
    public void calculation(ActionEvent event) {
        numberOne = Double.parseDouble(tfNumberOne.getText());
        numberTwo = Double.parseDouble(tfNumberTwo.getText());
        
        if (event.getSource() == btnAdd) {
            result = numberOne + numberTwo;
        } else if (event.getSource() == btnSubtract) {
            result = numberOne - numberTwo;
        } else if (event.getSource() == btnMultiply) {
            result = numberOne * numberTwo;
        } else if (event.getSource() == btnDivide) {
            result = numberOne / numberTwo;
        }
        
        lblResult.setText(Double.toString(result));
    }
    
    //------------------------------
    
//    @FXML
//    public void getUserInputOne(ActionEvent event) throws IOException {
//        numberOne = Double.parseDouble(tfNumberOne.getText());
//    }
//    
//    @FXML
//    public void getUserInputTwo(ActionEvent event) throws IOException {
//        numberTwo = Double.parseDouble(tfNumberTwo.getText());
//    }
//    
//    @FXML
//    public void addition(ActionEvent event) {
//        result = numberOne + numberTwo;        
//    }
//    
////    public void calculation(ActionEvent event) throws IOException {
////        operator = (Button)event.getSource().getText();
////        if (.equals("+")) {
////            result = numberOne + numberTwo;
////        }
////    }
////    
////    public double addition() throws IOException {
////        result = numberOne + numberTwo;
////        return result;
////    }
//    
//    @FXML
//    public void result(ActionEvent event) throws IOException {
//        lblResult.setText(Double.toString(result));
//    }
//    
    @FXML
    public void initialize() {
        System.out.println("initialize() success");
    }
    
}
