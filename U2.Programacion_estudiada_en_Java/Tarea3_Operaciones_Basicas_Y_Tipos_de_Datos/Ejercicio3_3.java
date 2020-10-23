package com.Tarea3_Operaciones_Basicas_Y_Tipos_de_Datos;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2;

        System.out.printf("Introduce el dividendo: ");
        n1 = sc.nextDouble();
        System.out.printf("Introduce el divisor: ");
        n2 = sc.nextDouble();
        System.out.printf("La división " + n1 + "/" + n2 + " es: " + (n1/n2));
    }
}
