/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_login1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *
 * @author Sudhanshu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Button close,Submit;
    
    @FXML  
    public void handleCloseButtonAction(MouseEvent event) {
    Window stage = close.getScene().getWindow();
    stage.hide();
}
    @FXML
    public void handleSubmitButtonAction(ActionEvent event) throws IOException{
       System.out.println("Clicked");
        Parent scene2 = FXMLLoader.load(getClass().getResource("/scene2/scene2.fxml"));
        Scene scene22 = new Scene(scene2);
        Stage stages = (Stage)((Node) event.getSource()).getScene().getWindow();
        stages.hide();
        stages.setScene(scene22);
        stages.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
