package com.Libro2;

import java.util.Scanner;

public class Pag61_Ejercicio54_Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo=true;
        System.out.print("Introduce un entero: ");
        int numero = sc.nextInt();
        for (int i = 2; i <numero ; i++) {
            if(numero%i==0){
                primo=false;
                break;
            }
        }
        System.out.println((primo) ? "Es primo": "No es primo");
    }

}
