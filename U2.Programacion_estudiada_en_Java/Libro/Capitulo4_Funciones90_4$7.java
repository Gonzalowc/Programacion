package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones90_4$7 {

    static boolean esPrimo(int num){
        boolean result=true;
        int i=2;

        if(num<2){
            result = false;
        }
        while(i< num && result ==true){
            if(num%i==0){
                result = false;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean bol;

        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if(esPrimo(i)){
                System.out.println(i+": Es primo");
            }else{
                System.out.println(i+": No es primo");
            }
        }

    }
}
