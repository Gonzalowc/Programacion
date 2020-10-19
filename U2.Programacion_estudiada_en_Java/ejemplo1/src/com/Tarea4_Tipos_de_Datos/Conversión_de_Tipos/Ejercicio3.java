package com.Tarea4_Tipos_de_Datos.Conversión_de_Tipos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        float n1,n2,n3;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una nota: ");
        n1 = sc.nextFloat();
        System.out.printf("Introduce otra nota: ");
        n2 = sc.nextFloat();
        System.out.printf("Introduce otra nota: ");
        n3 = sc.nextFloat();

        System.out.println("La media aritmetica es: " + (int)((n1+n2+n3)/3));
    }
}
