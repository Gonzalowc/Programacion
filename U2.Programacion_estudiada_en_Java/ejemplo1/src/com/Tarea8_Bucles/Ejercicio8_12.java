package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suspensos=0,i=0;
        float notas;
        while(i<5){
            System.out.printf("Introduce la nota del alumno: ");
            notas = sc.nextFloat();
            if(notas<5){
                suspensos++;
            }
            i++;
        }
        System.out.println((suspensos>0 ? "Hay "+suspensos+" suspensos": "No hay suspensos"));
    }
}
