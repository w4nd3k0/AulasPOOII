/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula05Controller implements Initializable {

    @FXML
    private DatePicker DPValidade;
    @FXML
    private ComboBox<String> CBCidade;
    @FXML
    private ListView<String> LVCidade;
    @FXML
    private Spinner<Integer> SPeriodo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Configurar os elementos que vão aparecer no combobox
        
        //Criar uma lista java fx de string no Combobox
        ObservableList Lista = FXCollections.observableArrayList();
        Lista.add("Buritizeiro");
        Lista.add("Pirapora");
        Lista.add("Várzea da Palma");

        //Adicionar Lista no Combobox
        CBCidade.setItems(Lista);
        
        //Para deixar ums cidade já selecionado
        CBCidade.setValue("Pirapora");
        
        //Asdicionar lista no ListView
        LVCidade.setItems(Lista);
        
        //Configurar o Spinner
        //Primeiro parametro é o minimo e segundo o maximo e o terceiro opcional
        SpinnerValueFactory<Integer> Valores = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8);
        
        SPeriodo.setValueFactory(Valores);
    }    

    @FXML
    private void PegarDados(ActionEvent event) {
        
        //Pegando a data do componente
        LocalDate Data = DPValidade.getValue();
        System.out.println(Data);
        
        System.out.println(CBCidade.getValue());
        
        //Pegando o elemento selecionado numa listView
        
        String Selecionado = LVCidade.getSelectionModel().getSelectedItem();
        System.out.println(Selecionado);
        
        System.out.println(SPeriodo.getValue());
        
    }
    
}
