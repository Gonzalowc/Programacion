package com.gwaackc;

import java.util.Scanner;

public class For6_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num,i;
        int divisibles=0;

        System.out.printf("Introduce un numero para saber si es primo: ");
        num =sc.nextLong();
        for(i=1; i<=num; i++){
            if(num%i==0){
                divisibles++;
            }
        }
        System.out.println((divisibles>2) ? "no es PRIMO" : "es PRIMO" );
    }
}
