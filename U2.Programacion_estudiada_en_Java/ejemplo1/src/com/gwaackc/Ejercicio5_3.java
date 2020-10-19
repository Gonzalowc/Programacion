package com.gwaackc;

import java.util.Scanner;

public class Ejercicio5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Introduce un numero");
        n1 = sc.nextInt();

        if(n1%2==0){
            System.out.println("El valor es PAR");
        } else if(n1%2==1){
            System.out.println("El valor es IMPAR");
        }else {
            System.out.println("El valor negativo no se puede dividir");
        }
    }
}
