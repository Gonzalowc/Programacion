package com.gwaackc;

import java.util.Scanner;

public class DoWhile6_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2 =1, n3 = 1;
        System.out.println("Introduce la altura y la base del cuadrado");
        n1 = sc.nextInt();
        do {
            n2=1;
            do{
                System.out.printf(" * ");
                n2++;
            }while(n2<=n1);
            n3++;
            System.out.println("");
        } while(n3<=n1);
    }
}
