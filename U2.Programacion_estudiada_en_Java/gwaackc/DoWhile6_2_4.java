package com.gwaackc;

import java.util.Scanner;

public class DoWhile6_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        do{
            System.out.printf("Introduce un numero: ");
            n1 = sc.nextInt();
            System.out.println("introduce otro numero que sume a "+ n1 +": ");
            n2 = sc.nextInt();
            System.out.println("La suma de "+ n1 +"+"+n2 +" es: "+ (n1+n2));
        } while((n1!=0 || n2!=0));
    }
}
