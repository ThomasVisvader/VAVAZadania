/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tommy
 */
public class Main extends Application {
    
    public static FXMLLoader jvmLoader;
    
    public static Scene jvmScene;
    
    public static ControllerJVM controllerJVM;
    
    public static Stage mainStage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        jvmLoader = new FXMLLoader(getClass().getResource("FXMLjvm.fxml"));
        jvmScene = new Scene(jvmLoader.load());
        controllerJVM = jvmLoader.getController();
        
        
        mainStage = new Stage();
        mainStage.setResizable(false);
        mainStage.setScene(jvmScene);
        mainStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
