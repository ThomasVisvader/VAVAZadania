/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexchecker;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tommy
 */
public class Main extends Application {
    
    public static FXMLLoader regexCheckerLoader;
    public static FXMLLoader cheatSheetLoader;
    
    public static Scene regexCheckerScene;
    public static Scene cheatSheetScene;
    
    public static ControllerRegexChecker regexCheckerController;
    public static ControllerCheatSheet cheatSheetController;
    
    public static Stage mainStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        regexCheckerLoader = new FXMLLoader(getClass().getResource("FXMLRegexChecker.fxml"));
        regexCheckerScene = new Scene(regexCheckerLoader.load());
        regexCheckerController = regexCheckerLoader.getController();
        
        cheatSheetLoader = new FXMLLoader(getClass().getResource("FXMLCheatSheet.fxml"));
        cheatSheetScene = new Scene(cheatSheetLoader.load());
        cheatSheetController = cheatSheetLoader.getController();
        
        mainStage = new Stage();
        mainStage.setResizable(false);
        mainStage.setScene(regexCheckerScene);
        mainStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
