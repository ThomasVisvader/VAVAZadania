/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexchecker;

import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Tommy
 */
public class ControllerCheatSheet {
    
    @FXML
    public void back() {
        Main.mainStage.setScene(Main.regexCheckerScene);
    }
            
}
