/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexchecker;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tommy
 */
public class ControllerRegexChecker implements Initializable {

    
    @FXML
    private TextField regexField;

    @FXML
    private TextArea textField;

    @FXML
    private Button checkButton;

    @FXML
    private CheckBox specialCharsCheckbox;
    
    @FXML
    private CheckBox caseCheckBox;
    
    @FXML
    private Label resultLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clear();
    }    
    
    public void clear() {
        resultLabel.setText("");
    }
    private boolean checkInputs() {
        if (regexField.getText().isEmpty()) {
            resultLabel.setText("Zadajte regex.");
            return false;
        }
        if (textField.getText().isEmpty()) {
            resultLabel.setText("Zadajte text.");
            return false;
        }
        return true;
    }
    
    @FXML
    public void cheatSheet() {
        Main.mainStage.setScene(Main.cheatSheetScene);
    }
    
    private String special() {
        if (specialCharsCheckbox.isSelected()) {
            return Pattern.quote(regexField.getText());
        }
        return regexField.getText();
    }
    
    @FXML
    public void check() {
        clear();
        if (checkInputs()) {
            Pattern pattern;
            if (caseCheckBox.isSelected()) {
                pattern = Pattern.compile(special(), Pattern.CASE_INSENSITIVE);
            }
            else {
                pattern = Pattern.compile(special());
            }
            Matcher matcher = pattern.matcher(textField.getText());
            if (matcher.find()) {
                resultLabel.setText("OK");
            }
            else {
                resultLabel.setText("NG");
            }
        }
    }
    
}
