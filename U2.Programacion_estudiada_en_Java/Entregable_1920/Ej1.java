package com.Entregable_1920;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pase=false;
        double n1;
        double n2;
        do{
            System.out.printf("Introduce nota del 1º Control: ");
            n1= sc.nextInt();
            System.out.printf("Introduce nota del 2º Control: ");
            n2= sc.nextInt();
            if((n1>=0 && n1<=10) && (n2>=0 && n2<=10)){
                pase = true;
            }else{
                System.out.println("Introduce notas válidas(0-10): ");
                pase = false;
            }
        } while(pase==false);


        double nota =(n1+n2)/2;
        if(nota>=5){
            System.out.print("Tu nota de programación es "+nota+" - ");
        }
        if(nota>=5 && nota<6){
            System.out.println("Suficiente");
        } else if(nota>=6 && nota<7){
            System.out.println("Bien");
        }else if(nota>=7 && nota<9){
            System.out.println("Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }else if(nota>=0 && nota<5){
            System.out.printf("Introduce nota del 3º Control(apto/no apto): ");
            sc.nextLine();
            String n3= sc.nextLine();
            boolean apto = n3.equalsIgnoreCase("apto") ? true : false;
            if(apto==true){
                System.out.println("Tu nota de Programación es 5 - Bien");
            }else{
                System.out.println("Tu nota de Programación es "+nota+" - Suspenso");
            }
        }
    }
}
