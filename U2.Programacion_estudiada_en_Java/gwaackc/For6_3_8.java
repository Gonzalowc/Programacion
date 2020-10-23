package com.gwaackc;

import java.util.Scanner;

public class For6_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num, i;

        System.out.printf("Introduce un numero: ");
        num = sc.nextLong();

        for(i=1;i<=num; i++){
            if(num%i==0){
                System.out.printf("Div: "+i+"\t");
            }
        }
    }
}
