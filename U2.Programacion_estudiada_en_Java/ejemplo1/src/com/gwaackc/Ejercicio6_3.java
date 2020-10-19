package com.gwaackc;

import java.util.Scanner;

public class Ejercicio6_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1, T;

        System.out.println("IF/ELSE");
        System.out.print("Introduce un numero y te dirá si es PAR(1) o IMPAR(0): ");
        n1 = sc.nextInt();

        if(n1%2 == 0){
            T=1;
        } else{
            T=0;
        }
        System.out.println("If/Else: El numero es PAR(1) o IMPAR(0): "+ T);
        System.out.println("CONDICIONAL");
        T = n1%2 == 0 ? 1 : 0;
        System.out.print("Condicional: El numero es PAR(1) o IMPAR(0): "+ T);

    }
}
