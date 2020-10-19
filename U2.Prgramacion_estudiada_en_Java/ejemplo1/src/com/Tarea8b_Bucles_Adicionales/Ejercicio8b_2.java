package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas,
  el cuadrado y el cubo de los 5 primeros números enteros
  a partir de uno que se introduce por teclado.*/
public class Ejercicio8b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min, max;

        System.out.printf("Introduce un numero: ");
        min = sc.nextInt();
        System.out.println("|\tNumero\t|\tCuadrado\t|\tCubo\t\t|");
        max = min+5;
        while(min++<max){
            System.out.println("|\t"+ min +"\t\t|\t"+(min*min)+"\t\t\t|\t"+(min*min*min)+"\t\t|");
        }


    }
}
