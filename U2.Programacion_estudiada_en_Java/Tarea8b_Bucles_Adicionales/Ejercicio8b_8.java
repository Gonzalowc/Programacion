package com.Tarea8b_Bucles_Adicionales;

import java.util.Scanner;
/*Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
        No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir
        como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
        introduce los datos correctamente y que el segundo día es posterior al primero.*/
public class Ejercicio8b_8 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String dia1, dia2;
        int hora1, hora2, diamin=-1, diamax=-1, dia=0;
        System.out.printf("Escribe el primer dia de la semana: ");
        dia1 = sc.nextLine();
        System.out.printf("Introduce la hora del dia(0-23h): ");
        hora1 = sc.nextInt();
        sc.nextLine();
        System.out.printf("Introduce el segundo dia de la semana: ");
        dia2 = sc.nextLine();
        System.out.printf("Introduce la hora del segundo dia(0-23h): ");
        hora2 = sc.nextInt();

        dia1 = dia1.toLowerCase();
        dia2 = dia2.toLowerCase();

        switch (dia1) {
            case "lunes": diamin = 1; break;
            case "martes": diamin = 2; break;
            case "miercoles": diamin = 3; break;
            case "jueves": diamin = 4; break;
            case "viernes": diamin = 5; break;
            case "sabado": diamin = 6; break;
            case "domingo": diamin = 7; break;
            default: System.out.println("Introduce un dia de la semana entre lunes y domingo en el primer dia");
        }
        switch (dia2) {
            case "lunes": diamax = 1; break;
            case "martes": diamax = 2; break;
            case "miercoles": diamax = 3; break;
            case "jueves": diamax = 4; break;
            case "viernes": diamax = 5; break;
            case "sabado": diamax = 6; break;
            case "domingo": diamax = 7; break;
            default: System.out.println("Introduce un dia de la semana entre lunes y domingo en el segundo dia");
        }
        if(diamin<=diamax && diamin>=1 && diamax>=1){
            dia = diamax - diamin;
            System.out.print("Horas entre los dias "+dia1.toUpperCase()+" con hora "+hora1+" y "+dia2.toUpperCase()+" con hora "+hora2);
        }else{
            System.out.println("Introduce dias de la misma semana");
        }

        dia++;

        if(dia>2){
            dia = (dia-2)*24;
            hora1= 24-hora1;
            dia = dia+hora1+hora2;
        }else if(dia==2){
            hora1= 24-hora1;
            dia = hora1+hora2;
        }else if(dia==1){
            hora1=hora2-hora1;
            dia= hora1;
        }
        if(diamin<=diamax && diamin>=1 && diamax>=1){
            System.out.print(" son "+dia+" horas");
        }
    }
}
