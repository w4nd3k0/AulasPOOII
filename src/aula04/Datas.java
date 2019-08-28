/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
/**
 *
 * @author IFNMG
 */
public class Datas {
    
    public static void main(String[] args) {
        
        //Pegar da taatual
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        //Criar Data Especifica
        LocalDate Atentandos = LocalDate.of(2019, 9, 11);
        System.out.println(Atentandos);
        
        //Mostrar no formato Brasileiro
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String HojeFormatado = hoje.format(formatador);
        System.out.println(HojeFormatado);
        
        //Pegar informações de uma data
        //Algumas informações estão em ingles

        System.out.println("Dia da semana: " + hoje.getDayOfWeek().name());
        System.out.println("Dia: " + hoje.getDayOfMonth());
        System.out.println("Mês: " + hoje.getMonthValue());
        System.out.println("Mês: " + hoje.getMonth().name());
        System.out.println("Ano: " + hoje.getYear());
        
        //Pegar as informações em portugues
        
        
    }
}
