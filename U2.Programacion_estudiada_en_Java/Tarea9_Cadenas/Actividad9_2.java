package com.Tarea9_Cadenas;

import java.util.Scanner;

public class Actividad9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad1, cad2;

        System.out.printf("JUGADOR 1: Introduce la contraseña: ");
        cad1 = sc.nextLine();
        cad1 = cad1.toLowerCase();
        System.out.println("JUGADOR 2: Pista: ");
        System.out.println("          Número de carácteres: "+ cad1.length());
        System.out.println("          Primera letra       : "+ cad1.charAt(0));
        System.out.println("          Última  letra       : "+ cad1.charAt(cad1.length()-1));
        System.out.printf("JUGADOR 2: Introduce la contraseña: ");
        cad2 = sc.nextLine();
        cad2 = cad2.toLowerCase();
        if(cad1.equals(cad1)){
            System.out.println("Acertaste!");
        }else{
            System.out.println("Fallaste");
        }
    }
}
