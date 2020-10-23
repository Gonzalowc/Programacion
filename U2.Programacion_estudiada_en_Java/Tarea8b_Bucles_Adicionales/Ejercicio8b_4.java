package com.Tarea8b_Bucles_Adicionales;


import java.util.Scanner;

public class Ejercicio8b_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i=1, neg=0, pos=0;

        do{
            System.out.printf("Introduce el numero "+i+"/10: ");
            num = sc.nextInt();

            if(num>=0){
                pos++;
            }else{
                neg++;
            }

        } while (i++<10);

        System.out.println("Numeros POSITIVOS: "+ pos);
        System.out.println("Numeros NEGATIVOS: "+ neg);
    }


}
