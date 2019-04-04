/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2vtt;

import ass2vtt.Converters.Ass2XmlConverter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author helio4
 */
public class Ass2Vtt extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FileConverter.fxml"));
        Parent root = (Parent)loader.load();
        FileConverterController controller = (FileConverterController)loader.getController();
        controller.setStage(stage);
        
        Scene scene = new Scene(root);
        Font.loadFont(Ass2Vtt.class.getResource("Roboto-Medium.ttf").toExternalForm(), 26.0);
        stage.setTitle("Ass2Vtt");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
