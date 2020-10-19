package com.gwaackc;

import java.util.Scanner;

public class Secundario {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola desde secundario");

        String nombre;
        System.out.println("Dime tu nombre");
        nombre = teclado.nextLine();

        System.out.println("hola" + nombre);


    }

}
