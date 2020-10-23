package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, cad,cad2=0;

        System.out.printf("Introduce un numero largo: ");
        num = sc.nextInt();
        System.out.println("Numero inicial: "+(int)num);
        while( num!=0){
            cad = num/10;
            num = Math.floor(cad);
            cad = cad-Math.floor(cad);
            cad2 = cad2*10+(cad*10);
            cad2 = Math.round(cad2);
            /*temp=n1/10;
            n1 = Math.floor(temp);
            temp = Math.floor(temp);
            numrev=numrev*10+(temp%10);*/
        }
        System.out.println("Numero inverso: "+ (int)cad2);
    }
}