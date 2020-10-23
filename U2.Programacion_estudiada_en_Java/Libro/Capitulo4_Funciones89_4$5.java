package com.Libro;

import java.util.Scanner;

public class Capitulo4_Funciones89_4$5 {
    static int maximo(int num, int num2){
        int resultado;
        resultado = (num>num2) ?  num : num2;
        return(resultado);

    }
    static int maximo(int num, int num2, int num3){
        int temp, resultado;
        temp = maximo(num,num2);
        return(maximo(temp,num3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2,n3;

        System.out.printf("Introduce un numero: ");
        n1= sc.nextInt();
        System.out.printf("Introduce un numero: ");
        n2= sc.nextInt();
        System.out.printf("Introduce un numero: ");
        n3= sc.nextInt();
        System.out.println("El maximo de los 3 numeros es: "+maximo(n1,n2,n3));
    }
}
