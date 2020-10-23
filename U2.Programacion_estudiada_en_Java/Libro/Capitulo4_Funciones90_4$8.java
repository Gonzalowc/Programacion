package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones90_4$8 {
    static boolean esPrimo(int num){
        boolean result=true;
        int i=2;

        if(num<2){
            result = false;
        }
        while(i< num && result ==true){
            if(num%i==0){
                result = false;
            }
            i++;
        }
        return result;
    }

    static int divisoresPrimos(int num){
        int contador=0;
        for(int i=2; i<=num;i++){
            if(esPrimo(i) && num%i==0){
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();
        System.out.printf("Para el numero "+ num+" hay "+divisoresPrimos(num)+" divisores primos");
    }
}
