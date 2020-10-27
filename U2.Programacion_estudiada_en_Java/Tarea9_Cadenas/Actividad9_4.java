package com.Tarea9_Cadenas;

import java.util.Scanner;

public class Actividad9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad,cad2="";
        double num;
        char caracter;

        System.out.printf("Introduce una frase: ");
        cad = sc.nextLine();
        num = (int)Math.floor((cad.length()-1)/2);//valor numerico
        caracter = cad.charAt((int)num);//caracter en ese valor
        cad2= cad2+caracter;//caracter lo meto en una cadena vacia para no comparar un numero con cadena
        if(cad2.equals(" ")){
            System.out.println("El caracter del medio es un espacio");
        }else{
            System.out.println("El caracter del medio No es un espacio es el caracter: "+ cad2);
        }

    }
}
