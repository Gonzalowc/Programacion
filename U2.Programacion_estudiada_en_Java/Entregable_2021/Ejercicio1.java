package com.Entregable_2021;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int altura;
    do{
        System.out.print("Introduce la altura de los calcetines: ");
        altura = sc.nextInt();
    }while(altura<4);

        for (int i = 1; i <altura-1 ; i++) {
            System.out.println("***     ***");
        }
        for (int i = 0; i <=1 ; i++) {
            System.out.println("******  ******");
        }
        
        
        
    }
}
