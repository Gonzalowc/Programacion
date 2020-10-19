package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();
        i=0;
        while(i++<num){
            System.out.println(i);
        }
    }

}
