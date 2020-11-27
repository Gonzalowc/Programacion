package com.Libro2;

import java.util.Scanner;

public class Pag59_Ejercicio54_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass_sys=1234, pass, fallos=0;
        do{
            System.out.printf("Introduce la contraseña");
            pass = sc.nextInt();
            if(pass_sys!=pass){
                fallos++;
            }
        }while(pass_sys!=pass && fallos<4 );
        if(pass_sys==pass){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        }else{
            System.out.println("Lo siento, tuviste "+fallos+" fallos.");
        }
    }

}
