package com.Libro2;

import java.util.Scanner;

public class Pag43_Ejercicio45_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax +b = 0");
        System.out.printf("Por favor, introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.printf("Por favor, introduzca el valor de a: ");
        double b = sc.nextDouble();
        if(a!=0){
            System.out.println("x = "+(double)(b/a));
        } else{
            System.out.println("Esa ecuación no tiene solución real");
        }
    }
}