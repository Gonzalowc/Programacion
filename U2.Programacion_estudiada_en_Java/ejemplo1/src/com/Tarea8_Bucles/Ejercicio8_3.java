package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, num_sys;
        num_sys = (int)(Math.random()*(101-1)+1);
        System.out.println("valor random: "+num_sys);
        do{
            System.out.printf("Introduce numeros hasta acertar || Abortar(-1): ");
            n1 = sc.nextInt();
            if(n1!= -1 && n1!=num_sys){
                System.out.println((n1>num_sys) ? "Menor" : "Mayor");
            }
        }while((n1 != -1) && (n1!=num_sys));

        System.out.println((n1==num_sys) ? "Has acertado!" : "Fallo: Valor random: "+num_sys);

    }
}
