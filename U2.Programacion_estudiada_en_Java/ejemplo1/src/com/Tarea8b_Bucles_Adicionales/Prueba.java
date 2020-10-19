package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,  result =1;
        System.out.println("Introduce: ");
        num = sc.nextInt();

        for(int i=1; i<=num;i++){
            result=result*i;
        }
        System.out.println("factorial de "+num+" es "+result);
    }
}
