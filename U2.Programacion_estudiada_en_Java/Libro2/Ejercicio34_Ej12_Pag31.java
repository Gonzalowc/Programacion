package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej12_Pag31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce la nota del 1º examen: ");
        double n1 = sc.nextDouble();
        n1=n1*0.4;
        System.out.printf("Introduce la nota que quieres sacar en el trimestre: ");
        double media = sc.nextDouble();
        // m = n1*0,4 +n2*0,6 // (m- n1*0,4)
        double n2 = (media-n1)/0.6;
        System.out.println("Para tener un "+media+" en el trimestre necesitas sacar un "+n2+" en el segundo examen");
    }
}
