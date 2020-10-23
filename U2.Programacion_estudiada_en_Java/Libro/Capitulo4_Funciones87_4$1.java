package com.Libro;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Capitulo4_Funciones87_4$1 {
    static void eco(int n){
        for(int i=0; i<n;i++){
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();

        eco(num);

    }
}
