package com.Tarea7_Varios;

import java.util.Scanner;

public class Ejercicio7_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.printf("Introduce un valor A: ");
        a = sc.nextInt();
        System.out.printf("Introduce un valor A: ");
        b = sc.nextInt();
        System.out.println("Valor de A: " + a + " Valor de B: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Valor de A: " + a + " Valor de B: " + b);

    }
}
