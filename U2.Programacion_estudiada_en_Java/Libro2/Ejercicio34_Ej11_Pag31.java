package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej11_Pag31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Mb= 0.00097656;

        System.out.printf("Introduce la cantidad de Kb: ");
        long Kb= sc.nextLong();
        System.out.printf(Kb+"Kb son "+Kb*Mb+"MB");



    }
}
