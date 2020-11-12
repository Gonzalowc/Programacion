package com.gwaackc;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifra, cant_num, pares=0, IMPARES=0, dif, div, digitoPar=0, digitoImpar=0;
        System.out.print("Por favor, introduzca un número entero positivo:");
        long numero = sc.nextInt();

        while(numero>0){
            cant_num = (int)Math.log10(numero);
            cifra = (int)(numero/Math.pow(10, cant_num));
            numero = (long)(numero-cifra*Math.pow(10, cant_num));
            div = (int)Math.log10(numero);
            if(cant_num>1){
                dif= (cant_num-1) - div;
            }else{
                dif=0;
            }

            if(dif>0){
                digitoPar= digitoPar*10;
            }

            if(cifra%2==0){
                pares=pares+cifra;
                digitoPar =digitoPar*10+cifra;
            }else{
                IMPARES = IMPARES+cifra;
                digitoImpar = digitoImpar*10+cifra;
            }
        }
        System.out.println("Dígitos pares: "+digitoPar);
        System.out.println("Dígitos impares: "+digitoImpar);
        System.out.println("Suma de los dígitos pares: "+pares);
        System.out.println("Suma de los dígitos impares: "+IMPARES);

    }
}
