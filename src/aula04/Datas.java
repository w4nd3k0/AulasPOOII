/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.*;
import java.time.temporal.*;
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
        String DiadaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String Mes = hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Dia da Semana: " + DiadaSemana);
        System.out.println("Mês: " + Mes);
        
        //Pegar o tempo decoorido entre duas datas
        LocalDate niverW = LocalDate.of(1987, Month.NOVEMBER, 10);
        LocalDate niverC = LocalDate.of(1998, Month.MAY, 19);
        
        Period Periodo = Period.between(niverW, niverC);
        
        System.out.println("Anos: " + Periodo.getYears());
        System.out.println("Mês: " + Periodo.getMonths());
        System.out.println("Dias: " + Periodo.getDays());
        
        //Pegar o tempo decorrido total em meses ou dia
        //import java.time.temporal.*
        
        long TotalAnos = ChronoUnit.YEARS.between(niverW, niverC);
        long TotalMeses = ChronoUnit.MONTHS.between(niverW, niverC);
        long TotalDias = ChronoUnit.DAYS.between(niverW, niverC);
        
        System.out.println("Total anos: " + TotalAnos);
        System.out.println("Total meses: " + TotalMeses);
        System.out.println("Total dias: " + TotalDias);
        
        //Operação com datas
        System.out.println("Mais 5 dias: " + hoje.plusDays(5));
        System.out.println("Mais 5 Semanas: " + hoje.plusWeeks(5));
        System.out.println("Mais 5 Anos: " + hoje.plusYears(5));
        System.out.println("Mais 2 meses: " + hoje.plusMonths(2));
        System.out.println("Menos 1 ano: " + hoje.minusYears(1));
        System.out.println("Menos 1 mês: " + hoje.minusMonths(1));
        System.out.println("Menos 1 ano: " + hoje.minusYears(1));
    }
}
