package com.gwaackc;

import java.util.Scanner;

public class NumeroMayor5_3_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 ;
        int n2;
        System.out.printf("Introduce un numero");
        n1 = sc.nextInt();
        System.out.printf("Introduce otro numero");
        n2 = sc.nextInt();

        if ( n1 == n2 ){
            System.out.println("El numero "+ n1+ " coincide con el segundo numero "+ n2);
        } else {
            if(n1>n2){
                System.out.println("El numero "+ n1+ " es mayor que el numero "+ n2);
            } else{
                System.out.println("El numero "+ n2+ " es mayor que el numero "+ n1);
            }
        }
    }
}
