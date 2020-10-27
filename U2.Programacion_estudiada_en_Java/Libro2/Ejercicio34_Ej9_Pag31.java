package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej9_Pag31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char elevado= 260;
        System.out.printf("Introduce el radio del cono: ");
        int radio = sc.nextInt();
        System.out.printf("Introduce el radio del cono: ");
        int altura = sc.nextInt();
        System.out.println("El volumen del cono es de: "+(Math.PI*radio*radio*altura)/3+"U3"+elevado);
    }
}
