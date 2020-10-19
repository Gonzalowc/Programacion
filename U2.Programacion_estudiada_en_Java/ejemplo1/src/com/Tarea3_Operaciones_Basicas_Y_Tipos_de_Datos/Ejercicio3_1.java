package com.Tarea3_Operaciones_Basicas_Y_Tipos_de_Datos;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1;
        byte n2;
        System.out.printf("Introduce un numero: ");
        n1 = sc.nextByte();
        System.out.printf("Introduce otro numero: ");
        n2 = sc.nextByte();
        System.out.println("la suma es: " + (n1+n2));
    }
}
