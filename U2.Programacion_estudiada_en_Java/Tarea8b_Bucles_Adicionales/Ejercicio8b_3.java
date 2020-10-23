package com.Tarea8b_Bucles_Adicionales;


import java.util.Scanner;

public class Ejercicio8b_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=0, n2=1, temp, num, i=2;

        System.out.printf("Introduce la cantidad de numeros de fibonacci que desea obtener: ");
        num = sc.nextInt();
        System.out.print(n1+", "+ n2+", ");
        do {
            temp = n1+n2;
            n1=n2;
            n2 = temp;
            if(num ==2){
                break;
            }
            System.out.print(n2+", ");
            i++;
        } while(i<num);
        System.out.print("...");
    }
}
