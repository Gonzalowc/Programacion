package com.gwaackc;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.printf("Introduce un numero: ");
            num = sc.nextInt();
        }while(num<3 || num%2==0);

        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {
                if(i==num || i==1 || i==j || i+j == (num+1)){
                    System.out.print("*");
                }else if(j>i && j<num+1-i ){
                    System.out.print("*");
                }else if(i>(int)(num/2)&&j+i>num && j-i<0){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.println("");
        }

    }
}
