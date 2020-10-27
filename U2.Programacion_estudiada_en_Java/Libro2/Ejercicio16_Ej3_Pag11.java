package com.Libro2;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio16_Ej3_Pag11 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] contentEsp = new String[10];
        String[] contentEn = new String[10];
        String espagnol, english;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce palabra en Inglés: ");
            contentEn[i] = sc.nextLine();
            System.out.printf("Introduce palabra en Español: ");
            contentEsp[i] = sc.nextLine();
        }
        System.out.printf("%-10s   %-10s\n","Inglés","Español");
        System.out.printf(" _________________________\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-10s | %-10s |\n",contentEn[i],contentEsp[i]);
        }
    }

}
