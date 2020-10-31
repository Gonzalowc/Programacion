package com.Entregable_1920;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int espacios=0,h;

        do{
            System.out.printf("Introduce la altura de la flecha doble hacia la izquierda: ");
            h = sc.nextInt();
            if(h<3 || h%2==0){
                System.out.println("Error. Introduce un numero impar y mayor o igual que 3.");
            }
        } while(h<3 || h%2==0);

        for (int i = 0; i < h; i++) {//altura flecha
            if(i<=h/2){//altura parte superior
                espacios=(h/2)-i;
                for (int j = 0; j < espacios; j++) {//añadir espacios
                    System.out.print("  ");
                }
                System.out.print(" *     *"); //parte de la flecha
            }
            if(i>h/2){//altura parte inferior
                espacios++;
                for (int j = 0; j < espacios; j++) {
                    System.out.print("  ");//añadir espacios
                }
                System.out.print(" *     *");// parte de la flecha
            }
            System.out.println("");//salto de linea
        }

    }
}
