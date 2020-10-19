package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;

public class Ejercicio8b_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, pass, pass_sys=1234;

        do {
            System.out.printf("Introduce la contraseña: ");
            pass = sc.nextInt();
            i++;
            if(pass==pass_sys){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        } while(i<4);
    }
}
