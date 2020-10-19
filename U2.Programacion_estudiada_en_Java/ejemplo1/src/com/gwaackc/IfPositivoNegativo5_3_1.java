package com.gwaackc;

import java.util.Scanner;

public class IfPositivoNegativo5_3_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = 12;
        int n2;
        System.out.printf("Introduce un numero");
        n2 = sc.nextInt();

        if ( n1 == n2 ){
            System.out.println("El numero "+ n2+ " coincide con el numero del sistema");
        }
        else {
            System.out.println("El numero "+ n2+ " no coincide con el numero del sistema "+ n1);
        }
    }
}
