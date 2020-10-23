package com.gwaackc;

import java.util.Scanner;

public class MultiploTres5_3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1;

        System.out.printf("Introduce un numero y comprueba si es multiplo de 3: ");
        n1 = sc.nextInt();

        if ( n1%3 == 0 ) {
            System.out.printf("El numero "+ n1 +" es multiplo de 3");
        } else{
            System.out.printf("El numero "+ n1 +" no es multiplo de 3");
        }
    }
}
