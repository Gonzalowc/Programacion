package com.Tarea4_Tipos_de_Datos.Conversión_de_Tipos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int n1,n2;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una nota: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce otra nota: ");
        n2 = sc.nextInt();

        System.out.println("La media aritmetica es: " + (float)(n1+n2)/2);
    }
}
