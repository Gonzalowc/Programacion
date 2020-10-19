package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.println("Introduce un numero: ");
        n2 = sc.nextInt();

        if((n1%2==0) && (n2%2==0)){
            System.out.println("Dos numeros pares");
        } else if ((n1%2==0) || (n2%2==0)){
            System.out.println("Un numero par");
        }else{
            System.out.println("Todos son impares");
        }
    }
}
