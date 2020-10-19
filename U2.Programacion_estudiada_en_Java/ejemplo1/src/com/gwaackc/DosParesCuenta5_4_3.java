package com.gwaackc;

import java.util.Scanner;

public class DosParesCuenta5_4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextInt();

        if( (n1%2 == 0) && (n2%2 == 0)){
            System.out.printf("Dos numeros PARES");
        } else {
            if ((n1%2 == 0) || (n2%2 == 0)){
                System.out.printf("Un numero PAR");
            } else{
                System.out.printf("Todos son IMPARES");
            }
        }

    }
}
