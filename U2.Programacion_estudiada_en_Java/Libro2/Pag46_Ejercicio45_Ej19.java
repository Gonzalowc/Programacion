package com.Libro2;

import java.util.Scanner;

public class Pag46_Ejercicio45_Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, potencia,suma=0, cifra, ceros, dif;
        do{
            System.out.printf("Introduce un número de hasta 5 cifras: ");
            numero = sc.nextInt();
        }while(numero>99999 || numero<-99999);
        if(numero<0){
            numero = numero*-1;
        }
        while (numero!=0){
            potencia = (int)Math.log10(numero);
            dif = potencia-1;
            potencia = (int)Math.pow(10,potencia);
            cifra = numero/potencia;
            numero = numero-(cifra*potencia);
            if(numero>0){
                ceros = (int)Math.log10(numero);
            }else {
                ceros = -1;
            }
            if(ceros==-1){
                dif=dif+1;
            }
            dif = dif-ceros;
            if(dif!=0){
                for (int i = 0; i <dif ; i++) {
                    suma++;
                }
            }else{
                suma++;
            }
        }
        System.out.println("El numero tenía "+suma+" cifras");
    }
}
