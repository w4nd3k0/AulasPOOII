/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

import Aula05_2.*;
import Aula05_.*;
import Aula05.*;
import aula04.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author IFNMG
 */
public class Aula06 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Aula06.fxml"));
        
        Scene scene = new Scene(root);
        
        //Nome da Janela
        stage.setTitle("Nome da janela");
        
        //Icone da Janlea
        stage.getIcons().add(new Image("/Aula06/bos.png"));
        
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
