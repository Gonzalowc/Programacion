package com.gwaackc;

import java.util.Scanner;

public class divisionDouble {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        System.out.printf("Introduce un numero: ");
        n1 = sc.nextDouble();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextDouble();
        System.out.println("la division es: "+(n1/n2));
    }
}
