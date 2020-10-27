package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej6_Pag30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce la base del triángulo: ");
        int base = sc.nextInt();
        System.out.printf("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        System.out.println("El área de un triángulo de base "+base+"U y de altura "+altura+"U es de "+(base*altura)/2+"U");
    }
}
