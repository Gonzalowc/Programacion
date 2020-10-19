package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas;
        int aprobados=0,condicionados=0, suspensos=0, i=0;
        while(i<6){
            System.out.printf("Introduce la nota del alumno: ");
            notas = sc.nextFloat();

            if(notas>=4 && notas<5){
                condicionados++;
            } else if(notas>=0 && notas<4){
                suspensos++;
            } else if(notas>=5 && notas<=10){
                aprobados++;
            }else{
                System.out.println("Introduce una nota valida");
                i--;
            }

            i++;
        }
        System.out.println("Los alumnos aprobados son: "+aprobados);
        System.out.println("Los alumnos condicionados son: "+condicionados);
        System.out.println("Los alumnos suspensos son: "+suspensos);

    }
}
