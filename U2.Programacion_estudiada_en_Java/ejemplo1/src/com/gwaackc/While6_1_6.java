package com.gwaackc;

import java.util.Scanner;

public class While6_1_6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int usuario, pass;
        int usuario_sys = 1809, pass_sys= 1234;

        System.out.println("Introduce tu usuario(1809): ");
        usuario = sc.nextInt();
        System.out.println("Introduce tu contraseña(1234): ");
        pass = sc.nextInt();

        while((usuario != usuario_sys) || (pass != pass_sys)){
            System.out.println("Introduce tu usuario(1809): ");
            usuario = sc.nextInt();
            System.out.println("Introduce tu contraseña(1234): ");
            pass = sc.nextInt();
            System.out.println("Siga intentandolo.");
        }
        System.out.println("Bienvenido "+ usuario );
    }
}
