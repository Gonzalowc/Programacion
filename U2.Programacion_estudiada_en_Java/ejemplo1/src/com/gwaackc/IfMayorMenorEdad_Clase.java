package com.gwaackc;

import java.util.Scanner;

public class IfMayorMenorEdad_Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        if(edad>=0){
            if(edad<18){
                System.out.println("Es menor de edad");
            } else if(edad>=18 && edad<65){
                System.out.println("Es mayor de edad");
            }else if(edad>=65 && edad<100){
                System.out.println("Es de la tercera edad");
            }
            else{
                System.out.println("Es centenario");
            }
        }else {
            System.out.println("Aun no hay personas con menor de 0 años");
        }
    }





}
