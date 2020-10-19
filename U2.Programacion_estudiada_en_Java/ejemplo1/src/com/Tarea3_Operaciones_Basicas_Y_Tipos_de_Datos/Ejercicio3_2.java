package com.Tarea3_Operaciones_Basicas_Y_Tipos_de_Datos;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short birth, year;

        System.out.println("Introduce el año de nacimiento");
        birth = sc.nextShort();
        System.out.println("Introduce el año Actual");
        year = sc.nextShort();
        System.out.println("Tienes " + (year - birth) + " años");
    }
}
