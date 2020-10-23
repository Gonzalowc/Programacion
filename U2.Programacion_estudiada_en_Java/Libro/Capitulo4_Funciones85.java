package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones85 {
    static int factorial(int n){
        int resultado;

        if(n == 0){
            resultado = 1;
        }else{
            resultado = n * factorial(n-1);
        }
        return(resultado);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Introduce numero para su factorial: ");
        n = sc.nextInt();
        System.out.println("El factorial de "+n+" es: "+factorial(n));

    }
}
