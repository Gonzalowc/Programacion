package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej10_Pag31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Kb = 1024;

        System.out.printf("Introduce la cantidad de Mb: ");
        int Mb = sc.nextInt();
        System.out.println(Mb+"Mb son "+(Mb*Kb)+"Kb");
    }
}
