package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones88_4$3 {

    static void cilindro(double radio, double altura, int modo){
        double vol, ar, resultado=0;
        if(modo==1){
            ar = 2*Math.PI*radio*(altura*radio);
            System.out.println("El area es: "+ar);

        }else if( modo==2){
            vol = Math.PI*radio*radio*altura;
            System.out.println("El volumen es: "+vol);
        }else{
            System.out.println("Modo no disponible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        int opcion;

        System.out.printf("Introduce la altura del cilindro: ");
        altura = sc.nextDouble();
        System.out.printf("Introduce el radio del cilindro: ");
        radio = sc.nextDouble();
        System.out.println("1-Area.\n2-Volumen.");
        System.out.printf("Introduce la opción de calculo del cilindro: ");
        opcion = sc.nextInt();

        cilindro(radio,altura,opcion);
    }
}
