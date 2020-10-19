package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, alumnos, suma, mayor;
        float media_edad;
        mayor=0;
        suma=0;
        alumnos=0;
        media_edad=0;
        do{

            System.out.printf("Introduce edades de alumnos: ");
            edad = sc.nextInt();

            mayor = (edad>=18) ? mayor+1 : mayor;

            suma = (edad>=0) ? suma+= edad : suma;
            alumnos = (edad>=0) ? alumnos+1 : alumnos;
            //System.out.println("alumnos: "+alumnos+" suma: "+ suma+"mayor: "+ mayor);

        } while(edad>=0);
        if(alumnos!=0){
            System.out.println("Se han introducido "+ alumnos+" alumnos");
            System.out.println("La suma de las edades son: "+suma);
            media_edad = (float) suma/alumnos;
            System.out.println("La media de las edades de los alumnos es de: "+ media_edad+" años");
            System.out.println("Hay "+mayor+" mayores de edad");
        } else{
            System.out.println("Empiece introduciendo al menos a un alumno");
        }
    }
}
