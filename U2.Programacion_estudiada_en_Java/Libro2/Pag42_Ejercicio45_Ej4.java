package com.Libro2;

import java.util.Scanner;

public class Pag42_Ejercicio45_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo=0;

        System.out.printf("Intruce número de horas: ");
        int horas = sc.nextInt();

        if(horas>0&&horas<=40){
            int salario=12;
            sueldo = horas*salario;
        }else if(horas>40){
            int salario=12;
            sueldo = 40*salario;
            salario=16;
            horas = horas-40;
            sueldo = sueldo+(horas*salario);
        }
        System.out.println("El sueldo semanal que le corresponde es de "+sueldo+"€");

    }
}
