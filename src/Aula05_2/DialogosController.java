/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_2;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class DialogosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AbrirDialogos(ActionEvent event) {
        
        //Caixa de Diálogo
        //Tipos de Ícones
        //Alert.AlertType.INFORMATION - informação
        //Alert.AlertType.ERRO - erro
        //Alert.AlertType.WARNING - atenção
        
        Alert Informacao = new Alert(Alert.AlertType.INFORMATION);
        Informacao.setTitle("Titulo de Caixa de Alerta"); //Titulo
        Informacao.setHeaderText("Mensagem de Cabeçalho"); //Cabeçalho
        Informacao.setContentText("parabens vc esta programando"); //Conteudo
        Informacao.showAndWait(); //Mostrando Alerta
        
        //Caixa de confirmação
        Alert Confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        Confirmacao.setTitle("Isso Mesmo?");
        Confirmacao.setHeaderText(null);
        Confirmacao.setContentText("Deseja doar o Salario");
        
        //Pegando a resposta atraves do botão selecionado
        Optional<ButtonType> resp = Confirmacao.showAndWait();
        if(resp.get() == ButtonType.OK){
            System.out.println("Clicou em OK");
        }
        
        //Caixa de entrada de dados
        
        TextInputDialog Entrada = new TextInputDialog();
        Entrada.setTitle("Titulo");
        Entrada.setHeaderText(null);
        Entrada.setContentText("Digite Idade");
        
        //pegando a String que a pessoa digitou
        Optional<String> Texto = Entrada.showAndWait();
        
        System.out.println(Texto.get());
    }
    
}
