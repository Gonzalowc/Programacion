package com.Libro2;

import java.util.Scanner;

public class Pag43_Ejercicio45_Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores de la ecuación de segundo grado aX2+bX+c=0");
        System.out.printf("Introduce aX^2: ");
        int a = sc.nextInt();
        System.out.printf("Introduce bX: ");
        int b = sc.nextInt();
        System.out.printf("Introduce c: ");
        int c = sc.nextInt();
        double ecuacion1;
        double ecuacion2;
        if(b*b-(4*a*c)>0){
            ecuacion1 = -b+Math.sqrt( (b*b)-(4*a*c) );
            ecuacion2 = -b-Math.sqrt( (b*b)-(4*a*c) );
            ecuacion1 = ecuacion1/(2*a);
            ecuacion2 = ecuacion2/(2*a);
            System.out.println("La variable X POSITIVA: "+ecuacion1);
            System.out.println("La variable X NEGATIVA: "+ecuacion2);
        } else if(b*b-(4*a*c)==0){
            ecuacion1 = -b/(2*a);
            System.out.println("La variable X es UNICA: "+ecuacion1);
        } else{
            System.out.println("Ya que el discriminante("+b+"^2-4*"+a+"*"+c+"=0) es menor que 0("+(b*b-(4*a*c))+") entonces esta ecuación no tiene solución real");
        }
    }
}
