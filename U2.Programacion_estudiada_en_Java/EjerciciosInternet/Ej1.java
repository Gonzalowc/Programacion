package com.EjerciciosInternet;

import java.util.Scanner;

public class Ej1 {
    static int suma(int n1, int n2){
        int resultado=0;

        resultado = n1+n2;

        return resultado;
    }
    static boolean esPositivo(int num){
        boolean resultado;

        resultado = (num>=0) ? true : false;

        return resultado;
    }
    static boolean esPar(int num){
        boolean resultado;

        resultado = (num%2==0) ? true : false;

        return resultado;
    }
    static int media(int n1,int n2){
        int resultado;

        resultado=(n1/n2);

        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, opcion, numeros=0, suma=0, sumaPos=0, sumaNeg=0, sumaPar=0, sumaImpar=0, pos=0, neg=0, par=0, impar=0, media=0;
        do{

            System.out.printf("Introduce un numero: ");
            num = sc.nextInt();

            System.out.printf("¿Quiere introducir más números?\n 1-Si. \n 2- En otra ocasión.");
            opcion = sc.nextInt();


            if(num>=0){
                sumaPos = suma(sumaPos,num);
                pos++;
            }else{
                sumaNeg = suma(sumaNeg,num);
                neg++;
            }
            if(esPar(num)){
                sumaPar = suma(sumaPar, num);
                par++;
            }else{
                sumaImpar = suma(sumaImpar,num);
                impar++;
            }
            numeros++;
            suma = suma+num;
            media = media(suma,numeros);
            if(opcion==2){
                break;
            }
        }while(opcion!=2);
        System.out.println("Numeros introducidos: "+numeros);
        System.out.println("Suma de positivos   : "+sumaPos);
        System.out.println("Suma de negativos   : "+sumaNeg);
        System.out.println("Suma de pares       : "+sumaPar);
        System.out.println("Suma de impares     : "+sumaImpar);
        System.out.println("Suma total          : "+suma);
        System.out.println("Media               : "+media);



    }
}
