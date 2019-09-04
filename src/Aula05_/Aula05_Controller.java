/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula05_Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Imprimir(ActionEvent event) {
        System.out.println("Está Imprimindo");
    }

    @FXML
    private void NovaJanela(ActionEvent event) throws IOException {
        //Código para Abrir uma nova janela
        
        //Lero o FXML que representa a nova jannela
        //Adicionar o throws
        Parent root = FXMLLoader.load(getClass().getResource("NovaJanela.fxml"));
        
        //Criando a cena
        //(Importanto a classe Scene)
        Scene Novajanela = new Scene(root);
        
        //Criando a janela (Stage)
        Stage stage = new Stage(StageStyle.UTILITY);
        
        //Titulo da janela
        stage.setTitle("Titulo da Nova janela");
        
        //Adiconbando a Cena na janela
        stage.setScene(Novajanela);
        
        //Configurando o MODALITY
        //Diz respeito ao comportamento das janelas anteriores ao ser mostrada
        //Para bloquear intereação com as janela anteriores
        stage.initModality(Modality.APPLICATION_MODAL);
        
        //Mostrando a janela
        stage.show();
    }
    
}
