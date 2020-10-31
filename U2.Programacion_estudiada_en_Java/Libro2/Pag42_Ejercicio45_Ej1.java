package com.Libro2;

import java.util.Scanner;

public class Pag42_Ejercicio45_Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un dia de la semana: ");
        String dia = sc.nextLine();

        switch (dia){
            case "Lunes": System.out.println("BD"); break;
            case "Martes": System.out.println("FOL"); break;
            case "Miercoles":
            case "Jueves": System.out.println("SI"); break;
            case "Viernes": System.out.println("FOL"); break;
        }

    }
}
