package com.Entregable_2021;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numtemp, eliminados=0;
        int resto;


        System.out.printf("Introduce un numero: ");
        num = sc.nextInt();
        numtemp=num;
        num=0;

        while(numtemp!=0) {
            resto = numtemp % 10;
            numtemp = (int) Math.floor(numtemp / 10);
            if (resto == 0) {
                num=num;
            }else if(resto == 8){
                num=num;
            }else{
                num = resto+ num*10;
            }
        }
        numtemp=0;
        while(num!=0){
            resto=num%10;
            numtemp = resto+numtemp*10;
            num=num/10;
        }
        System.out.println("numero final: "+numtemp);
    }
}
