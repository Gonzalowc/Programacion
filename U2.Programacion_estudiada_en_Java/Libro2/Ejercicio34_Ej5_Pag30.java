package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej5_Pag30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.printf("Introduce la altura del rectángulo: ");
        int altura = sc.nextInt();

        System.out.println("El áreaa del rectángulo de base "+base+"U y de altura "+altura+"U es de "+(base*altura)+"U2");
    }
}
