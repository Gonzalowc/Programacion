package com.Tarea9_Cadenas;

import java.util.Scanner;

public class Actividad9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad1, cad2;

        System.out.printf("Introduce una palabra: ");
        cad1 = sc.nextLine();
        System.out.printf("Introduce otra palabra: ");
        cad2 = sc.nextLine();

        if(cad1.length()<cad2.length()){
            System.out.println("La cadena más corta es: "+ cad1.toUpperCase()+" con "+ cad1.length()+" carácteres.");
        }else if(cad2.length()<cad1.length()){
            System.out.println("La cadena más corta es: "+ cad2.toUpperCase()+" con "+ cad2.length()+" carácteres.");
        }else{
            System.out.println("Las cadenas son igual de largas con "+ cad2.length()+" carácteres.");

        }

    }
}
