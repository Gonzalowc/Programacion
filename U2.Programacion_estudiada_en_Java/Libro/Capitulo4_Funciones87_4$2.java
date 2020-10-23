package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones87_4$2 {
    static void comprendidos(int a, int b){
        int mayor = (a>b) ? a : b;
        int menor = (a>b) ? b : a;

        for(int i = menor; i<=mayor;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.printf("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        n2 = sc.nextInt();

        comprendidos(n1,n2);

    }
}
