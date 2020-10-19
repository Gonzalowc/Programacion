package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,temp,rango;

        System.out.printf("Introduce inicio del bucle: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce final del bucle: ");
        n2 = sc.nextInt();
        temp = n1;
        n1 = (n1>n2) ? n1 = n2 : n1;
        n2 = (n2<temp) ? n2= temp : n2;
        do {
            System.out.printf("Introduce numero dentro del rango: ");
            rango = sc.nextInt();
        } while((rango<n1) || (rango>n2));
        System.out.println("El numero "+rango+" está dentro del rango "+n1+"-"+n2);

    }
}
