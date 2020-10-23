package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.printf("Introduce la altura de la U: ");
        altura = sc.nextInt();

        for(int i = 1; i<=altura; i++){
            if(i<altura){
                System.out.println("*     *");
            } else{
                System.out.println(" ***** ");
            }


        }


    }
}
