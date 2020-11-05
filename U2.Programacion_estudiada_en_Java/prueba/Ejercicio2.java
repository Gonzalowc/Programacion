package com.U2_Examen_practica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, parte1=0, parte2=0,div, cifra;
        int corte, cantidad_num, dif;
        do{
            System.out.printf("Introduce un entero positivo de minimo 2 dígitos: ");
            num = sc.nextLong();
        }while(num<10);

        do{
            System.out.printf("Introduzca la posición a partir de la cual quiere partir el número: ");
            corte = sc.nextInt();

            //Finejercici2otro
        }while(Math.log10(num)<corte && corte>=1);


        while(num>0){
            cantidad_num = (int)Math.floor(Math.log10(num));//longitud del numero
            div = (int)Math.pow(10, cantidad_num); //10 elevado longitud del numero
            cifra = num/div; // primer numero de la cadena
            System.out.println(cifra);

            num = num-(cifra*div); // quitar primer numero
            if(Math.floor(Math.log10(num))!= Math.floor(Math.log10(div))-1 && Math.floor(Math.log10(num))>=0){
                System.out.println("num "+Math.floor(Math.log10(num)));
                System.out.println("div "+(Math.floor(Math.log10(div))-1));
                dif =  ( (int)Math.floor( Math.log10(div) )-1) - (int)Math.floor( Math.log10(num) ) ;

                for (int i = 1; i <=dif ; i++) {

                    if(Math.floor(Math.log10(div))-1 > 0 || num>0){

                        cifra=cifra*10;
                    }
                }
                if( num==0 &&dif>0){
                    div = (int)Math.floor(Math.log10(div));
                for(int i = (int)div; i>=1; i--){
                        cifra=cifra*10;
                    }
                }
            }
            if(Math.log10(parte1)<corte-2){
                parte1=(parte1*10)+cifra;
            }else{
                parte2=(parte2*10)+cifra;
            }
        }
        System.out.println("Primer número: "+parte1);
        System.out.println("Segundo número: "+parte2);
    }
}
