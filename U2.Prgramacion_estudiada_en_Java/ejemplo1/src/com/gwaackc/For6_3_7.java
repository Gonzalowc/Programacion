package com.gwaackc;

import java.util.Scanner;

public class For6_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte lado, i, j;

        System.out.printf("Introduce el lado del cuadrado: ");
        lado = sc.nextByte();
        for(i=1;i<=lado; i++){
            for(j=1;j<=lado;j++){
                if((i==1 || i==lado) || (j==1 || j==lado)){
                    System.out.printf(" * ");
                }else {
                    System.out.printf("   ");
                }
            }
            System.out.println("");
        }
    }
}
