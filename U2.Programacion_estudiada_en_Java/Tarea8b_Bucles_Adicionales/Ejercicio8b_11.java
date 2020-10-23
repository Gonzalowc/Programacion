package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.printf("Introduce la altura de la x: ");
        altura = sc.nextInt();

        if(altura%2==1 && altura>=3){
            for(int i = 1; i<=altura; i++){
                for(int j =1;j<=altura;j++){
                    if(i == j || j+i==altura+1 ){
                        System.out.print(" *");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("ERROR: Introduce una altura impar y mayor que 3");
        }

    }
}
