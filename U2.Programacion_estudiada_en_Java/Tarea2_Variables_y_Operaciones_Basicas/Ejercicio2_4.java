package com.tarea2_Variables_y_Operaciones_Básicas;

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float longitud;

        System.out.println("introduce el numero de millas");
        longitud = sc.nextFloat();

        System.out.println(longitud+" millas son "+ (longitud*1.689)+ " Km");
    }
}
