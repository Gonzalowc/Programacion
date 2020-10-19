package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila, num,i=0;

        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();
        while(num>i){
            fila=1;
            while (fila<=num){
                System.out.printf("*");
                fila++;
            }
            System.out.println("");
            num--;
        }

    }
}
