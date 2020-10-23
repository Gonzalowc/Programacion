package com.tarea2_Variables_y_Operaciones_Básicas;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextInt();
        System.out.println("la division es: " + (n1/n2));
    }
}
