package com.Libro2;

import java.util.Scanner;

public class Pag52_Ejercicio45_Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jug1,jug2;


            System.out.print("Turno jugador 1: (Introduce piedra, papel o tijera): ");
            jug1 = sc.nextLine();

            switch (jug1){
                case "piedra": break;
                case "papel": break;
                case "tijera": break;
                default:
                    System.out.println("Error de parámetros.Jugador 1");
            }
        System.out.print("Turno jugador 1: (Introduce piedra, papel o tijera): ");
        jug2 = sc.nextLine();

        switch (jug2){
            case "piedra": break;
            case "papel": break;
            case "tijera": break;
            default:
                System.out.println("Error de parámetros.Jugador 2");
        }
        if(jug1.equals(jug2)){
            System.out.println("Empate");
        }else if((jug1.equals("piedra") && jug2.equals("papel")) || (jug1.equals("papel") && jug2.equals("tijera")) ||
                (jug1.equals("tijera") && jug2.equals("piedra"))){
            System.out.println("Gana el jugador 2");
        }else if((jug2.equals("piedra") && jug1.equals("papel")) || (jug2.equals("papel") && jug1.equals("tijera")) ||
                (jug2.equals("tijera") && jug1.equals("piedra"))){
            System.out.println("Gana el jugador 1");
        }else{
            System.out.println("Error. Vuelve a iniciar");
        }



    }
}
