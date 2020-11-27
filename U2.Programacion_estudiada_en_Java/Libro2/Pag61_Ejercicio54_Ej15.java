package com.Libro2;

import java.util.Scanner;

public class Pag61_Ejercicio54_Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow=1,base;
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la base: ");
        int exponente = sc.nextInt();

        for (int i = 1; i <=exponente ; i++) {
            pow*=base;
            System.out.println(base+"^"+i+" = "+pow);
        }
    }
}
