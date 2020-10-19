package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        do{
            System.out.printf("Introduce un numero entero: ");
            n1 = sc.nextInt();
            if(n1!=0){
                System.out.println((n1%2==0) ? "el numero "+n1+" es PAR" : "el numero "+n1+"es IMPAR");
                System.out.println((n1>=0) ? "el numero "+n1+" es POSITIVO" : "el numero "+n1+"es NEGATIVO");
                System.out.println("el cuadrado de "+n1+" es " + n1*n1);
            }
        } while(n1!=0);

    }


}
