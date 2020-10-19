package com.gwaackc;

import java.util.Scanner;

public class millas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Float longitud;

        System.out.println("introduce el numero de millas");
        longitud = sc.nextFloat();

        System.out.println(longitud+" millas son "+ (longitud*1.689)+ " Km");
    }
}
