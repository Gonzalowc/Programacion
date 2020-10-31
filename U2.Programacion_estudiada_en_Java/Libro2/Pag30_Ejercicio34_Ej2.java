package com.Libro2;

import java.util.Scanner;

public class Pag30_Ejercicio34_Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesetas=166.386;
        System.out.printf("Introduce la cantidad de euros a convertir en pesetas: ");
        double euros = sc.nextDouble();

        System.out.println(euros+"€ son "+(pesetas*euros)+" pesetas");
    }
}
