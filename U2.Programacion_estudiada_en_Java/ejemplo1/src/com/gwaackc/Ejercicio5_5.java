package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1, n2, n3;

        System.out.println("Introduce un numero");
        n1 = sc.nextInt();
        System.out.println("Introduce un numero");
        n2 = sc.nextInt();
        System.out.println("Introduce un numero");
        n3 = sc.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("Mayor primero: "+n1);
        } else if(n2>n3){
            System.out.println("Mayor segundo: "+n2);
        }else if( n1==n2 && n2==n3){
            System.out.println("Todos son iguales: "+ n1);
        }else{
            System.out.println("Mayor tercero: "+n3);
        }
    }
}
