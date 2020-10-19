package com.gwaackc;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        short birth, year;

        System.out.println("Introduce el año de nacimiento");
        birth = sc.nextShort();
        System.out.println("Introduce el año Actual");
        year = sc.nextShort();
        System.out.println("Tienes " + (year - birth) + " años");

        System.out.println("Otra forma de calcular es:");
        System.out.println("Introduce tu edad");
        birth = sc.nextShort();
        System.out.println("Introduce el año Actual");
        year = sc.nextShort();
        System.out.println("Tu año de nacimiento es: " + (year - birth));
    }
}
