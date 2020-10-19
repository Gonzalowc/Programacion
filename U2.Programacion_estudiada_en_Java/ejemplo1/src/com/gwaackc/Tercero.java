package com.gwaackc;

import java.util.Scanner;

public class Tercero {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, direccion;

        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce la direccion");
        direccion = sc.nextLine();

        System.out.println("__________________________");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellidos);
        System.out.println("Direccion: "+direccion);
        System.out.println("__________________________");

        System.out.println("Nombre: "+nombre+"Apellido: "+apellidos+"Direccion: "+direccion);
    }
}
