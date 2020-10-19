package com.Tarea7_Varios;

import java.util.Scanner;

public class Ejercicio7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad, nivel_de_estudios;
        double ingresos;
        boolean jasp;

        System.out.printf("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.printf("Introduce tu nivel de estudio: ");
        nivel_de_estudios = sc.nextInt();
        System.out.printf("Introduce tu Sueldo: ");
        ingresos = sc.nextDouble();

        jasp = ((edad<=28) && (nivel_de_estudios>3) && (ingresos>28000)) ? true : false;
        System.out.println(jasp);
    }
}
