package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i=0,resultado=1;
        System.out.printf("Introduce un numero para hacer su factorial(x!): ");
        num = sc.nextInt();
        while(i++<num){
            resultado=resultado*i;
        }
        System.out.println("factorial de "+ num+"! es: "+resultado);
    }
}
