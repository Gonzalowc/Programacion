package com.gwaackc;

import java.util.Scanner;

public class While6_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Introduce un numero para calcular su cuadrado: ");
        n1 = sc.nextInt();

        while(n1 != 0){
            double elevado = Math.pow(n1,2);
            System.out.println(n1+"^2: "+ elevado);
            System.out.println("Introduce un numero para calcular su cuadrado: ");
            n1 = sc.nextInt();
        }
    }
}
