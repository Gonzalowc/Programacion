package com.Libro2;

import java.util.Scanner;

public class Pag30_Ejercicio34_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        int n2 = sc.nextInt();

        System.out.println("Suma: "+(n1+n2));
        System.out.println("Resta: "+(n1-n2));
        System.out.println("Multiplicación: "+(n1*n2));
        System.out.print("División: ");
        System.out.print((n2!=0) ? n1/n2: n1+"/"+n2+" no se puede realizar");

    }
}
