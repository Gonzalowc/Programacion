package com.Libro2;

import java.util.Scanner;

public class Ejercicio45_Ej2_Pag42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce una hora del día(H): ");
        int hora = sc.nextInt();

        if(hora>=6 && hora<=12){
            System.out.println("Buenos días");
        } else if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        } else if((hora>=21 && hora<=24) || (hora>=0 &&hora<=5)){
            System.out.println("Buenas noches");
        }else{
            System.out.println("Introduce una hora válida(0-24H)");
        }
    }
}
