package com.Entregable_2021;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,loteria;
        String num1,num2,num3,lote;
        boolean todos=false;

        System.out.println("Introduce 3 numeros: ");
        System.out.print("Introduce el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduce el primer numero: ");
        n2 = sc.nextInt();
        System.out.print("Introduce el primer numero: ");
        n3 = sc.nextInt();
        System.out.print("Introduce el numero de loteria: ");
        loteria = sc.nextInt();
        num1 = Integer.toString(n1);
        num2 = Integer.toString(n2);
        num3 = Integer.toString(n3);
        lote = Integer.toString(loteria);
        if(lote.indexOf(num1)>=0 && lote.indexOf(num2)>=0 && lote.indexOf(num3)>=0){
           todos=true;
        }else{
            todos=false;
        }
        if(todos==true){
            System.out.println("Ese número le va a dar suerte");
        }else{
            System.out.println("Ese numero no le va a dar suerte");
        }
    }
}