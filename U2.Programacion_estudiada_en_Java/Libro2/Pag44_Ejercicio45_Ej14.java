package com.Libro2;

import java.util.Scanner;

public class Pag44_Ejercicio45_Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero: ");
        int n = sc.nextInt();

        if(n%2==0 && n%5==0){
            System.out.println("El numero "+n+" es par y divisible por 5");
        }else if(n%2==0){
            System.out.println("El numero "+n+" es par");
        }else if(n%5==0){
            System.out.println("El numero "+n+" es divisible por 5");
        }else{
            System.out.println("El numero es impar y no divisible por 5");
        }
    }
}
