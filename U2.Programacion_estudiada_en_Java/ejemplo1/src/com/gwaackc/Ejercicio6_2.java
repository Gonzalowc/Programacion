package com.gwaackc;

import java.util.Scanner;

public class Ejercicio6_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.printf("Introduce un numero del 0 al 10 incluidos: ");
        n1 = sc.nextInt();
            if((n1>=0) && (n1<=10)){
                System.out.printf("El numero "+ n1 +" escrito es: ");
            }
            switch (n1) {
                case 0: System.out.printf("Cero"); break;
                case 1: System.out.printf("Uno"); break;
                case 2: System.out.printf("Dos"); break;
                case 3: System.out.printf("Tres"); break;
                case 4: System.out.printf("Cuatro"); break;
                case 5: System.out.printf("Cinco"); break;
                case 6: System.out.printf("Seis"); break;
                case 7: System.out.printf("Siete"); break;
                case 8: System.out.printf("Ocho"); break;
                case 9: System.out.printf("Nueve"); break;
                case 10: System.out.printf("Diez"); break;
                default: System.out.printf("Introduce un numero entre el 0 y el 10 incluidos"); break;
            }
    }
}
