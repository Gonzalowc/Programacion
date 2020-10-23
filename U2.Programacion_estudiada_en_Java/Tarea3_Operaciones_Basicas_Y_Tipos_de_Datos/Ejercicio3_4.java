package com.Tarea3_Operaciones_Basicas_Y_Tipos_de_Datos;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float millas;

        System.out.printf("Introduzca la distancia en millas");
        millas = sc.nextFloat();

        System.out.println(millas + " millas son " + (millas*1.609) +" Kilometros");
    }
}
