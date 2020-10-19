package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int IDarbol=0, mas_alto=0;
        float alturaArbol, masAlturaArbol=0;

        System.out.println("Introduzca la altura de cada arbol.");
        do{
            System.out.printf("Introduzca la altura del arbol ID = " + IDarbol+" :");
            alturaArbol = sc.nextFloat();
            if(masAlturaArbol<alturaArbol){
                mas_alto = IDarbol;
                masAlturaArbol = alturaArbol;
            }
            IDarbol++;
        }while(alturaArbol!= -1);
        System.out.println("El arbol más alto es el que tiene ID: "+mas_alto+" con una altura de "+masAlturaArbol+" cm");
    }
}
