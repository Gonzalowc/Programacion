package com.gwaackc;

import java.util.Scanner;

public class While6_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String pass, pass_sys = "1234";
        int pass, pass_sys = 1234;


        System.out.printf("Introduce tu contraseña: ");
        pass = sc.nextInt();
        //pass = sc.nextLine();

        //while(!pass.equals(pass_sys)){
        while(pass != pass_sys){
            System.out.println("Ha fallado la contraseña");
            System.out.printf("Introduce tu contraseña: ");
            pass = sc.nextInt();
            //pass =  sc.nextLine();
        }

        System.out.println("Bienvenido!");

    }
}
