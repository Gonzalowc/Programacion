package com.Libro2;

import java.util.Scanner;

public class Pag61_Ejercicio54_Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce carácter de la pirámide: ");
        String caracter = sc.nextLine();
        System.out.print("Introduce carácter de la pirámide: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <altura*2 ; j++) {
                if(i==altura || j==altura || i+j>altura && j-i<altura){
                    System.out.print(caracter);
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
