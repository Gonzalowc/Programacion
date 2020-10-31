package com.Libro2;

import java.util.Scanner;

public class Pag44_Ejercicio45_Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcta=false;
        int acertadas=0;
        System.out.println("Pregunta1.?");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
        int respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta2.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta3.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+ 1: acertadas;
        System.out.println("Pregunta4.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");

            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta5.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta6.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta7.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta8.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta9.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;
        System.out.println("Pregunta10.");
        System.out.println("1 : Respuesta");
        System.out.println("2 : Respuesta");
        System.out.println("3 : Respuesta");
            respuesta = sc.nextInt();

        switch (respuesta){
            case 1: correcta=true;break;
            case 2: correcta=false;break;
            case 3: correcta=false;break;
        }
        acertadas = (correcta ==true) ? acertadas+1 : acertadas;

        System.out.println("Has sacado un "+acertadas+"/10");
    }
}