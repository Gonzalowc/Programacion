package com.Libro2;

import java.util.Scanner;

public class Ejercicio16_Ej2_Pag11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, direccion, telefono;

        System.out.printf("Introduce tu Nombre: ");
        nombre = sc.nextLine();
        System.out.printf("Introduce tu Dirección: ");
        direccion = sc.nextLine();
        System.out.printf("Introduce tu Teléfono: ");
        telefono = sc.nextLine();

        System.out.printf("%-10s: %-20s\n","Nombre",nombre);
        System.out.printf("%-10s: %-20s\n","Dirección",direccion);
        System.out.printf("%-10s: %-20s\n","Teléfono",telefono);

    }

}
