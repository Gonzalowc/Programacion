package com.gwaackc;

import java.util.Scanner;

public class IfInteger5_3_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n2;
        System.out.printf("Introduce un numero");
        n2 = sc.nextInt();

        if ( n2 == 0 ){
            System.out.println("El numero "+ n2+ "  es exactamente 0.");
        }
        else {
            if (n2 > 0){
                System.out.println("El numero "+ n2+ " es mayor que 0.");
            } else{
                System.out.println("El numero "+ n2+ " es menor que 0.");
            }

        }


    }
}
