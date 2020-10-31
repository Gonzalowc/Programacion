package com.Entregable_1920;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce una cadena: ");
        String cadena = sc.nextLine();
        cadena=cadena.toUpperCase();

        if(cadena.length()>10){//acotar a 10 la cadena
            cadena = cadena.substring(0,10);
        }

        for (int i = 0; i < (cadena.length()); i++) {//altura superior
            for (int j = 0; j < cadena.length()-i-1; j++) {//espacios
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {//valores izquierda a derecha(creciendo)
                System.out.print(cadena.charAt(j));
            }
            for (int k = i; k >= 0; k--) {//valores derecha a izquierda(decreciendo)
                System.out.print(cadena.charAt(k));
            }
            System.out.println("");//salto
        }

        for (int i = (cadena.length() - 2); i >=0 ; i--) {//altura inferior
            for (int j = cadena.length()-i-1; j > 0; j--) {//espacios
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {//valores/izquierda a derecha(creciendo)
                System.out.print(cadena.charAt(j));
            }
            for (int k = i; k >= 0; k--) {//valores derecha a izquierda(decreciendo)
                System.out.print(cadena.charAt(k));
            }
            System.out.println("");//salto
        }
    }
}


