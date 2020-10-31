package com.Libro2;

import java.util.Scanner;

public class Pag31_Ejercicio34_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Kb = 1024;

        System.out.printf("Introduce la cantidad de Mb: ");
        int Mb = sc.nextInt();
        System.out.println(Mb+"Mb son "+(Mb*Kb)+"Kb");
    }
}
