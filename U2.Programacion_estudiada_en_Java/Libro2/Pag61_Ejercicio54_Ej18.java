package com.Libro2;

import java.util.Scanner;

public class Pag61_Ejercicio54_Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max,temp;
        do{
            System.out.println("Introduce el primer límite");
            min= sc.nextInt();
            System.out.println("Introduce el segundo límite");
            max= sc.nextInt();
        }while(min==max);
        if(min>max){
            temp=max;
            max=min;
            min=temp;
        }
        for (int i = min; i <=max ; i=i+7) {
            System.out.print(i+" ");
        }
    }
}
