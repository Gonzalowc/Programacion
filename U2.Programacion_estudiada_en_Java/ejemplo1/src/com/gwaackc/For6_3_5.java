package com.gwaackc;

import java.util.Scanner;

public class For6_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.printf("Introduce el numero hasta donde quieres ver los multiplos de 3 y de 7: ");
        n2 = sc.nextInt();

        for(n1=1; n1<=n2; n1++){
            if(n1%3==0){
                System.out.printf("Multiplo de 3: "+ n1);
            }
            //Estructura{
            if(n1%3==0 && n1%7==0){
                System.out.printf(" || ");
            }
            if(n1%3!=0 && n1%7==0){
                System.out.printf("                  || ");
            }
            // } fin Estructura
            if(n1%7==0){
                System.out.printf("Multiplo de 7: " + n1);
            }
            if(n1%3==0 || n1%7==0) {
                System.out.println("");
            }

        }
    }
}
