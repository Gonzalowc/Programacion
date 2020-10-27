package com.Libro2;

import java.util.Scanner;

public class Ejercicio45_Ej6_Pag43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double g=9.81;

        System.out.printf("Introduce la altura para saber el tiempo que tarda en caer: ");
        double h = sc.nextDouble();
        System.out.println("El objeto tardará "+(Math.sqrt((h*2)/g))+"s en caer desde una altura de "+h+"m");
    }
}
