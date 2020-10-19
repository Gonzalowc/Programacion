package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Introduce un numero");
        n1 = sc.nextInt();

        if(n1==0){
            System.out.println("El valor no es ni positivo ni negativo");
        } else if(n1<0){
            System.out.println("El valor es negativo");
        } else{
            System.out.println("El valor es positivo");
        }
    }
}
