package com.Libro2;

import java.util.Scanner;

public class Ejercicio16_Ej1_Pag11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.printf("Introduce tu nombre: ");
        nombre =sc.nextLine();

        System.out.printf("Nombre: %10s", nombre);
    }
}
