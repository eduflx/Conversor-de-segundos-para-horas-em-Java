/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eduardoflx.att4lista3ed1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Att4Lista3ED1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = scanner.nextInt();
           
        //Divisão em horas
        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        
        //Divisão em minutos
        int minutos = resto / 60;
        //Restante em segundos
        int segundos = resto % 60;

        System.out.println("Tempo convertido: "
                + horas + "h, "
                + minutos + "min e "
                + segundos + "seg");

        scanner.close();
    }
}
