package com.gwaackc;

import java.util.Scanner;

public class While6_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=0,n2;
        System.out.print("Introduzca un numero para escribir su equivalencia en asteriscos: ");
        n2 = sc.nextInt();
        while(n1++<n2){
            System.out.print("*");
        }
        System.out.println("\nHa escrito una cantidad de "+ (n1-1) +" asteriscos");
    }
}
