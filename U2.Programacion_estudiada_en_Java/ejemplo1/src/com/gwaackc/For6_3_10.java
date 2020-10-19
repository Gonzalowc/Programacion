package com.gwaackc;

import java.util.Scanner;

public class For6_3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long min,max, temp, i, j;
        int suma=0, divisible;

        System.out.printf("Introduce el minimo del rango para saber si es primo: ");
        min =sc.nextLong();
        System.out.printf("Introduce el maximo del rango para saber si es primo: ");
        max =sc.nextLong();
        //quitar valor = 0
        if(min<=0){
            min=1;
        }else if(max<=0){
            max=1;
        }

        if(min>max){
            temp = min;
            min =max;
            max = temp;
        }
        for(i=min; i<=max; i++){
            divisible=0;
            for(j=1; j<=i;j++){
                if(i%j==0){
                    divisible++;
                }
            }
            if(divisible<=2){
                suma++;
            }
        }
        System.out.println("Hay "+suma+" primos entre el número "+min+" y "+ max);
    }
}
