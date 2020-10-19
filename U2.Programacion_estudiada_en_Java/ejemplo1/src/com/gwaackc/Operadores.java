package com.gwaackc;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.printf("Introduce un numero");
        n1 = sc.nextInt();
        System.out.printf("Introduce otro numero");
        n2 = sc.nextInt();
        System.out.println("la suma es: "+(n1+n2));
        System.out.println("la resta es: "+(n1-n2));


    }
}
