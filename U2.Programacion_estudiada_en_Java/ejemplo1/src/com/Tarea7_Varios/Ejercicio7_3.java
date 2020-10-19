package com.Tarea7_Varios;

import java.util.Scanner;

public class Ejercicio7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        char numassci;
        //num = (int)(Math.random()*(123-97)+97);
        //num = (int)Math.floor(Math.random()*(97-(122+1))+122);
        num = (int)(Math.random()*(97-(123))+123);
        numassci = (char)num;
        System.out.println("numero: "+num + ". letra: "+numassci);

    }
}
