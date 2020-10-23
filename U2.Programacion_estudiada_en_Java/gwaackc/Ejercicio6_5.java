package com.gwaackc;

import java.util.Scanner;

public class Ejercicio6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI= 3.1416;
        float n1;
        int menu;

        System.out.printf("Introduce el radio: ");
        n1 = sc.nextFloat();
        System.out.println("1.Calcular Diametro");
        System.out.println("2.Calcular Perimetro");
        System.out.println("3.Calcular Área");
        menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("Diametro: "+(2*n1));
                break;
            case 2:
                System.out.println("Perímetro: "+(2*PI*n1));
                break;
            case 3:
                System.out.println("Área: "+(PI*n1*n1));
                break;
            default:
                System.out.println("Introduzca un número del menú.");
                break;
        }
    }
}
