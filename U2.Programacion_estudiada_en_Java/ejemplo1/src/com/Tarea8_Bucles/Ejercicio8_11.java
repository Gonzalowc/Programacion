package com.Tarea8_Bucles;

import java.util.Scanner;

public class Ejercicio8_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factor1=0, factor2=0;
        while(factor1<=10){
            factor2=0;
            while (factor2<=10){
                System.out.printf("|\t"+factor1+"x"+factor2+"  \t= "+(factor1*factor2)+"    |  \t");
                factor2++;
            }
            System.out.println("");
            factor1++;
        }
    }
}
