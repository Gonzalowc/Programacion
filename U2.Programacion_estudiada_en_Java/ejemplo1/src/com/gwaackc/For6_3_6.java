package com.gwaackc;

import java.util.Scanner;

public class For6_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte n1,n2,i, j;

        System.out.printf("Introduce el alto: ");
        n1 = sc.nextByte();
        System.out.printf("Introduce el ancho: ");
        n2 = sc.nextByte();

        for(i=1; i<=n1;i++){
            for(j=1; j<=n2; j++){
                System.out.printf(" * ");
            }
            System.out.println("");
        }

    }
}
