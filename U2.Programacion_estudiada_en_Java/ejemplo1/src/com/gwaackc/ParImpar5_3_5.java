package com.gwaackc;

import java.util.Scanner;

public class ParImpar5_3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.printf("Introduce un numero y comprueba si es par o impar: ");
        n1 = sc.nextInt();

        if ( n1%2 == 0 ){
            System.out.printf("El numero "+ n1 +" es PAR");
        } else {
            System.out.printf("El numero "+ n1 +" es IMPAR");
        }
    }
}
