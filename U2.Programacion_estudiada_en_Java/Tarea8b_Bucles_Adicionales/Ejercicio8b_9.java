package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.printf("Introduce la altura: ");
        altura = sc.nextInt();

        for(int i = 1;i<altura; i++){
            System.out.println(" *");
        }
        for(int i = 0; i<=Math.floor(altura/2);i++)
            System.out.print(" *");
    }
}
