package com.gwaackc;

import java.util.Scanner;

public class DosposiblePositivo5_4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1,n2;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        n2 = sc.nextInt();

        if( n1>0 || n2>0){
            System.out.printf("Almenos uno de los dos numeros es positivo");
        } else {
            System.out.printf("Ninguno de los dos numeros son positivos");
        }
    }
}
