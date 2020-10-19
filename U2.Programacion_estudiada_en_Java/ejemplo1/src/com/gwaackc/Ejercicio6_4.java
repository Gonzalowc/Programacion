package com.gwaackc;

import java.util.Scanner;

public class Ejercicio6_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        byte n1,n2, menor, Menor;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextByte();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextByte();

        if(n1>n2){
            menor = n2;
        } else{
            menor = n1;
        }
        System.out.println("IF/ELSE: El menor de los numeros es: "+ menor);

        Menor = n1>n2 ? n2 : n1;

        System.out.println("Condicional: El menor de los numeros es: "+ Menor);
    }
}
