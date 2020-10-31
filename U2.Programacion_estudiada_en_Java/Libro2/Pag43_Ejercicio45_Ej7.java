package com.Libro2;

import java.util.Scanner;

public class Pag43_Ejercicio45_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce primera nota: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduce segunda nota: ");
        int n2 = sc.nextInt();
        System.out.printf("Introduce tercera nota: ");
        int n3 = sc.nextInt();

        System.out.println("La media de las notas "+n1+", "+n2+", "+n3+" es "+(n1+n2+n3)/3);

    }
}
