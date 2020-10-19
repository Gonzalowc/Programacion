package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, temp, numrev=0;

        System.out.printf("Introduce un numero largo: ");
        n1 = sc.nextLong();
        System.out.println("Numero inicial: "+n1);
        while( n1!=0){
            temp=n1/10;
            n1 = Math.floor(temp);
            temp = Math.floor(temp);
            numrev=numrev*10+(temp*10);
        }
    }
}
