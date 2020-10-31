package com.Entregable_2021;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca horas: ");
        int horas = sc.nextInt();
        System.out.println("Introduzca minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Introduzca segundos: ");
        int segundos = sc.nextInt();
        System.out.println("Segundos a incrementar: ");
        int segundosInc = sc.nextInt();
        System.out.println("Aumentando la hora...");
        for (int i = 0; i < segundosInc; i++) {

            if (segundos < 59) {
                segundos++;
            } else {
                segundos = 0;
                minutos++;
            }
            if (minutos >= 60) {
                horas++;
                minutos = 0;
            }
            if (horas > 24) {
                horas = 0;
            }
            if(minutos<10 && segundos<10){
                System.out.println(horas+":0"+minutos+":0"+segundos);
            }else if(minutos<10){
                System.out.println(horas+":0"+minutos+":"+segundos);
            }else if(segundos<10){
                System.out.println(horas+":"+minutos+":0"+segundos);
            }else{
                System.out.println(horas+":"+minutos+":"+segundos);
            }
        }
    }
}
