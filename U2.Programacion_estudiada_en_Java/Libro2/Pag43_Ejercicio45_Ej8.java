package com.Libro2;

import java.util.Scanner;

public class Pag43_Ejercicio45_Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce primera nota: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduce segunda nota: ");
        int n2 = sc.nextInt();
        System.out.printf("Introduce tercera nota: ");
        int n3 = sc.nextInt();
        int media=(n1+n2+n3)/3;
        if(media>=9 && media<=10){
            System.out.print("SOBRESALIENTE: ");
        } else if (media>=7 && media<9){
            System.out.print("NOTABLE: ");
        }else if(media>=6 && media<7){
            System.out.print("BIEN: ");
        }else if(media>=5 && media<6){
            System.out.print("SUFICIENTE: ");
        }else if(media>=0 && media<5){
            System.out.print("INSUFICIENTE: ");
        } else{
            System.out.println("Introduce notas válidas(0-10): ");
        }
        System.out.print("La media de las notas "+n1+", "+n2+", "+n3+" es "+media);

    }
}
