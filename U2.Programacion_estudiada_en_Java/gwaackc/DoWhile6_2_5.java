package com.gwaackc;

import java.util.Scanner;

public class DoWhile6_2_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuario, pass;
        int usuario_sys = 1809, pass_sys = 1234;

        do{
            System.out.printf("Introduce el usuario: ");
            usuario = sc.nextInt();
            System.out.printf("Introduce la contraseña: ");
            pass = sc.nextInt();
        } while((usuario != usuario_sys) || (pass != pass_sys));

        System.out.println("Bienvenido!");
    }

}
