package com.Entregable_1920;

import java.util.Scanner;

public class Ej5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce el radio menor: ");
        int cadena = sc.nextInt();


        if(cadena>10){//acotar a 10 la cadena
            System.out.println("Introduce un numero menor que 10");
        }else{
            for (int i = 0; i < (cadena); i++) {//altura superior
                for (int j = 0; j < cadena-i-1; j++) {//espacios
                    System.out.print(" ");
                }
                for(int j = 0; j < i; j++){//valores izquierda a derecha(creciendo)
                    if(j==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for(int k = i; k >= 0; k--){//valores derecha a izquierda(decreciendo)
                    if(k==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");//salto
            }

            for (int i = (cadena - 2); i >=0 ; i--) {//altura inferior
                for (int j = cadena-i-1; j > 0; j--) {//espacios
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {//valores/izquierda a derecha(creciendo)
                    if(j==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for (int k = i; k >= 0; k--) {//valores derecha a izquierda(decreciendo)
                    if(k==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");//salto
            }
        }
    }
}


