package com.Libro2;

import java.util.Scanner;

public class Pag61_Ejercicio54_Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,suma=0;
        do{
            System.out.print("Introduce un entero positivo: ");
            num = sc.nextInt();
        }while(num<0);
        for (int i = num; i <num+100; i++) {
            suma+=i;
        }
        System.out.println("La suma de todos los numeros es: "+suma);
    }
}
