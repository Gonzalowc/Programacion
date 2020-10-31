package com.Libro2;

import java.util.Scanner;

public class Pag30_Ejercicio34_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros=166.386;

        System.out.printf("Introduce la cantidad de pesetas: ");
        double pesetas = sc.nextDouble();

        System.out.println(pesetas+" pesetas son "+pesetas/euros+"€");


    }
}
