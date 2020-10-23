package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones88_4$4 {
    static void maximo(int num, int num2){
        int resultado;
        System.out.print("El mayor es el número: ");
        resultado = (num>num2) ?  num : num2;
        System.out.print(resultado);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.printf("Introduce un numero: ");
        n1= sc.nextInt();
        System.out.printf("Introduce un numero: ");
        n2= sc.nextInt();
        maximo(n1,n2);
    }
}
