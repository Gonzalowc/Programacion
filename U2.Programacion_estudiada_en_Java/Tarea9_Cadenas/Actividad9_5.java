package com.Tarea9_Cadenas;

import java.util.Scanner;

public class Actividad9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad,javalin, javalen;
        int valor;

        System.out.printf("Introduce la frase: ");
        cad = sc.nextLine();

        javalin = "javalín, javalón   ";
        javalen = "   javalen, len, len";

        if(cad.indexOf(javalin)==0){
            valor = cad.lastIndexOf("   ");
            cad = cad.substring(valor+3, cad.length());
            System.out.println(cad);
        }else if(cad.indexOf(javalen)>0){
            valor = cad.indexOf("   ");
            cad = cad.substring(0, valor);
            System.out.println(cad);
        }else{
            System.out.println("No está escrito en el idioma de Javalandia ");
        }

    }

}
