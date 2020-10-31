package com.Libro2;

import java.util.Scanner;

public class Pag42_Ejercicio45_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce el dia de la semana(1-7): ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Lunes"); break;
            case 2: ;
                System.out.println("Martes"); break;
            case 3: ;
                System.out.println("Miercoles"); break;
            case 4: ;
                System.out.println("Jueves"); break;
            case 5: ;
                System.out.println("Viernes"); break;
            case 6: ;
                System.out.println("Sabado"); break;
            case 7: ;
                System.out.println("Domingo"); break;
            default:
                System.out.printf("Introduce un número válido (1 al 7)"); break;
        }
    }
}
