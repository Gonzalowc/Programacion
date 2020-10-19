package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();

        if(n1==12){
            System.out.println("Ha introducido el valor correcto 12");
        }else{
            System.out.println("Ha introducido un valor distinto del valor del sistema 12");
        }

    }
}
