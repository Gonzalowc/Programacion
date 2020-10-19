package com.gwaackc;

import java.util.Scanner;

public class TresNumeroMayor5_4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n1,n2,n3;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextLong();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextLong();
        System.out.printf("Introduce un ultimo numero: ");
        n3 = sc.nextLong();

        if(n1>n2 && n1>n3){
            System.out.printf("El mayor es "+ n1);
        } else {
            if(n2>n3){
                System.out.printf("El mayor es "+ n2);
            } else {
                if((n1==n2) && (n2==n3)){
                    System.out.printf("Todos los numeros son iguales");
                } else {
                    System.out.printf("El mayor es "+ n3);
                }
            }
        }

    }
}
