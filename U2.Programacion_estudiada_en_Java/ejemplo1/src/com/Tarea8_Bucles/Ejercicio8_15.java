package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,i=1, divisible,j, primos=0;

        System.out.printf("Introduzca un numero: ");
        numero = sc.nextInt();
        if(numero>0){
            while(i<=numero){
                j=1;
                divisible=0;
                while(j<=i){
                    if(i%j==0){
                        divisible++;
                    }
                    j++;
                }


                if(divisible>2){
                    System.out.println(i+"-> no PRIMO");
                }else{
                    primos++;
                    System.out.println(i+"-> PRIMO");
                }

                i++;
            }
            System.out.println("Entre 1 y "+ numero+" hay "+primos+" números primos");
        } else{
            System.out.println("Introduce un numero válido");
        }

    }
}
