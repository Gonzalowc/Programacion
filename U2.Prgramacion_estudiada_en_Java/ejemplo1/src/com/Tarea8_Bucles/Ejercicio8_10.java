package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,i=0;
        do{
            System.out.printf("Introduzca un numero para hacer su tabla de multiplica: ");
            n1 = sc.nextInt();
        } while(n1<1 || n1>10);

        while(i<=10){
            System.out.println(n1+"x"+i+"= "+(n1*i));
            i++;
        }

    }
}
