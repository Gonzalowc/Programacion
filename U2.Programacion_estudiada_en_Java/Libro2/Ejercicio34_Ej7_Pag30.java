package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej7_Pag30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Intoduce la base imponible: ");
        double baseI = sc.nextDouble();
        System.out.print("Intoduce el IVA(0-100%): ");
        double IVA = sc.nextDouble();
        IVA = IVA/100;
        System.out.println("El total de la factura con base imponible de "+baseI+"€ y con IVA "+IVA*100+"% es de "+(baseI+(baseI*IVA))+"€" );

    }
}
