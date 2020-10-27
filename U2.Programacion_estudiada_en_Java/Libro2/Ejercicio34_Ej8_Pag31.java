package com.Libro2;

import java.util.Scanner;

public class Ejercicio34_Ej8_Pag31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario=12;

        System.out.printf("Intruce número de horas: ");
        int horas = sc.nextInt();

        System.out.println("Para "+horas+"H con un salario de "+salario+"€, le corresponden "+salario*horas+"€");

    }
}
