package com.Tarea8b_Bucles_Adicionales;


import java.util.Scanner;

public class Ejercicio8b_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra;
        int altura, i=1, j;

        System.out.printf("Introduce el caracter de la piramide: ");
        letra = sc.nextLine();
        System.out.printf("Introduce la altura de la piramide: ");
        altura = sc.nextInt();

        do{
            j=altura-(i-1);
            while(j<=altura){
                System.out.print(" "+letra+" ");
                j++;
            }
            System.out.println("");
        }while(i++<altura);

    }
}
