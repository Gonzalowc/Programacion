package com.Entregable_1920;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numaux;

        System.out.printf("Introduce un numero para saber si es capicúa: ");
        long num = sc.nextInt();
        numaux=num;
        double vuelta=0;

        while(numaux!=0){
            vuelta=vuelta*10+(numaux%10);
            numaux=numaux/10;
        }
        if(num==vuelta){
            System.out.println("El número "+(long)vuelta+" es capicúa");
        }else{
            System.out.println("El número "+num+" no se lee igual al revés: "+(long)vuelta);
        }

    }
}
