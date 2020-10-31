package com.Libro2;

import java.util.Scanner;

public class Ejercicio45_Ej11_Pag44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, min;
        long segundos;
        do{
            System.out.printf("Introduce la hora(0-23): ");
            hora = sc.nextInt();
            System.out.printf("Introduce los minutos(0-60): ");
            min = sc.nextInt();
        }while((24-hora<0) || (60-min<0));

        hora = (24-hora-1)*60;
        min = 60-min;
        min = min+hora;
        segundos = min*60;
        System.out.println("Faltan "+segundos+"s hasta las 00");
    }
}
