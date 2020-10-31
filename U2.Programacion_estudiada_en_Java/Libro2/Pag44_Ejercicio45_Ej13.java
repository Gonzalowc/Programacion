package com.Libro2;

import java.util.Scanner;

public class Pag44_Ejercicio45_Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temporal;
        System.out.printf("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        int num2 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3){
            num1=num1;
        }else{
            if(num2<num1){
                temporal = num2;
                num2=num1;
                num1=temporal;
            }
            if(num3<num1){
                temporal = num3;
                num3=num1;
                num1=temporal;
            }
        }
        if(num2>num1 && num2<num3){
            num2 = num2;
        }else{
            if(num2<num1){
                temporal = num2;
                num2=num1;
                num1=temporal;
            }
            if(num3<num2){
                temporal = num3;
                num3=num2;
                num2=temporal;
            }
        }
        System.out.println("Numeros de menor a mayor: "+num1+"<"+num2+"<"+num3);
    }
}
