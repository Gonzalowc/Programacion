package com.tarea2_Variables_y_Operaciones_Básicas;

import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float C;

        System.out.printf("Introduce la temperatura en ºC: ");
        C = sc.nextFloat();

        System.out.println(C + "ºC son " + (((9*C)/5)+32) +"ºF");
    }
}
