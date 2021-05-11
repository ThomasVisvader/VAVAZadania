/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.apache.commons.io.FileUtils;

public class ControllerJVM {

    @FXML
    private Label nameLabel;

    @FXML
    private Label versionLabel;

    @FXML
    private Label archLabel;
    
    @FXML
    private Label userLabel;

    @FXML
    private Label javaVersionLabel;
    
    @FXML
    private Label directoryLabel;
    
    @FXML
    private Label sizeLabel;
    
    @FXML
    private Label totalLabel;

    @FXML
    private Label freeLabel;

    @FXML
    private Label maxLabel;
    
    @FXML
    public void initialize() {
        Runtime runtime = Runtime.getRuntime();
        nameLabel.setText(System.getProperty("os.name"));
        versionLabel.setText(System.getProperty("os.version"));
        archLabel.setText(System.getProperty("os.arch"));
        userLabel.setText(System.getProperty("user.name"));
        javaVersionLabel.setText(System.getProperty("java.version"));
        directoryLabel.setText(System.getProperty("user.home"));
        sizeLabel.setText(String.valueOf(FileUtils.sizeOfDirectory(new File(directoryLabel.getText()))) + " B");
        totalLabel.setText(String.valueOf(runtime.totalMemory()) + " B");
        maxLabel.setText(String.valueOf(runtime.maxMemory()) + " B");
        freeLabel.setText(String.valueOf(runtime.freeMemory()) + " B");
    }

}

