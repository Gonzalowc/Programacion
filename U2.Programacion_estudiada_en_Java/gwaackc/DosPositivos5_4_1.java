package com.gwaackc;

import java.util.Scanner;

public class DosPositivos5_4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1,n2;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextInt();

        if((n1>0) && (n2>0)){
            System.out.printf("Los numeros " + n1 +" y " + n2 +" son positivos");
        }else{
            if((n1>0) && (n2<0)){
                System.out.printf("El numero "+ n1 +" es positivo y el numero "+ n2 +" es negativo");
            }
            if((n2>0) && (n1<0)){
                System.out.printf("El numero "+ n2 +" es positivo y el numero "+ n1 +" es negativo");
            } else {
                System.out.printf("Los numeros " + n1 + " y " + n2 + " son negativos");
            }
        }
    }
}
