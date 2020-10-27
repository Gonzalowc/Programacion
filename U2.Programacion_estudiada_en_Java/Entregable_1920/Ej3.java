package com.Entregable_1920;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binario = "";

        System.out.printf("Introduce un numero decimal positivo: ");
        int decimal = sc.nextInt();


        if(decimal>0){
            while(decimal>0){
                if(decimal%2==0){
                    binario="0"+binario;
                }else{
                    binario="1"+binario;
                }
                decimal=(int)Math.floor(decimal/2);
            }
        }else if(decimal==0){
            binario="0";
        }else{
            System.out.println("Introduce números positivos.");
        }
        if(decimal>=0){
            System.out.println("El numero en binario es: "+binario);
        }


    }
}
