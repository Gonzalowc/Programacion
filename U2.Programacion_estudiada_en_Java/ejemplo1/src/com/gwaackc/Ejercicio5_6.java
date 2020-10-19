package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidad, tiempo;
        final double gravedad = 9.8;
        System.out.println("introduce el tiempo");
        tiempo = sc.nextInt();
        if(tiempo>0){
            velocidad = tiempo*gravedad;
            System.out.println("La velocidad es de "+ velocidad);
        }else{
            System.out.println("Tiempo incorrecto");
        }
    }
}
