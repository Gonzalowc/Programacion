package com.gwaackc;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
        Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares
        y los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número,
        primer dígito del segundo número, segundo dígito del primer número, segundo dígito del segundo número,
        tercer dígito del primer número... Para facilitar el ejercicio, podemos suponer que el usuario introducirá
        dos números de la misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int
        donde sea necesario para admitir números largos.
*/
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long entero1, entero2, par=0,impar=0, dif=0,div=0, cant_num;
        long valor=0;
        System.out.println("Introduce un numero: ");
        entero1 = sc.nextLong();
        System.out.println("Introduce otro numero: ");
        entero2 = sc.nextLong();

        while(entero1>0 && entero2>0){
            cant_num = (int)Math.log10(entero1);

            valor = (long)Math.pow(10,cant_num);
            dif = (int)valor/10;
            if((valor/10)!=0) {
                div = (int) entero1 / (valor / 10);

                if (div % 10 == 0) {
                    par = par * 10;
                }
            }


            valor = (int)entero1%10;
            if(valor % 2 == 0){
                par = par*10+valor;
            }else{
                impar = impar*10+valor;
            }
            entero1 = (long)(Math.floor(entero1/10));

            valor = (int)entero2%10;
            if(valor % 2 == 0){
                par = par*10+valor;
            }else{
                impar = impar*10+valor;
            }
            entero2 = (long)(Math.floor(entero2/10));
        }


        System.out.print("El número formado por los dígitos pares es: ");


        while(par>0){
            valor= (int)par%10;
            System.out.print(valor);
            par = (int)par/10;
        }
        System.out.println("");
        System.out.print("El número formado por los dígitos impares es: ");
        while(impar>0){
            valor= (int)impar%10;
            System.out.print(valor);
            impar = (int)impar/10;
        }

    }
}
