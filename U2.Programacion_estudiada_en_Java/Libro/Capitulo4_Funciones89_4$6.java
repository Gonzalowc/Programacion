package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones89_4$6 {

    static boolean esVocal(String cad){
        boolean resultado=true;
        cad = cad.toLowerCase();

        resultado = (cad.equals("a") || cad.equals("e") || cad.equals("i") || cad.equals("o") || cad.equals("u")) ? true : false;


        return(resultado);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;

        System.out.printf("Introduce una letra: ");
        caracter = sc.nextLine();
        if(caracter.length()==1){
            if(esVocal(caracter)){
                System.out.println("El caracter ["+caracter+"] es una vocal");
            }else{
                System.out.println("El caracter ["+caracter+"] no es una vocal");
            }
        }else{
            System.out.println("Introduce un solo caracter");
        }


    }
}
