package com.Libro2;

import java.util.Scanner;

public class Pag44_Ejercicio45_Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        int opcion;
        do{
            System.out.printf("Introduce el simbolo de la pirámide: ");
            c = sc.nextLine();
            if(c.length()!=1){
                System.out.println("Introduce un solo simbolo, letra o numero.");
            }
        }while(c.length()!=1);
        do{
            System.out.println("Opciones: ");
            System.out.println("1. Vertice arriba");
            System.out.println("2. Vertice abajo");
            System.out.println("3. Vertice izquierda");
            System.out.println("4. Vertice derecha");
            System.out.printf("Introduce opción: ");
            opcion = sc.nextInt();
        }while(opcion<1 && opcion>4);

        switch (opcion){
            case 1:
                System.out.println("      "+c+"   ");
                System.out.println("    "+c+" "+c+" "+c+"  ");
                System.out.println("  "+c+" "+c+" "+c+" "+c+" "+c+" ");
                System.out.println(c+" "+c+" "+c+" "+c+" "+c+" "+c+" "+c);
            break;
            case 2 :
            System.out.println(c+" "+c+" "+c+" "+c+" "+c+" "+c+" "+c);
            System.out.println("  "+c+" "+c+" "+c+" "+c+" "+c+" ");
            System.out.println("    "+c+" "+c+" "+c+"  ");
            System.out.println("      "+c+"   ");
            break;
            case 3 :
            System.out.println(c+"      ");
            System.out.println(c+" "+c+"     ");
            System.out.println(c+" "+c+" "+c+"  ");
            System.out.println(c+" "+c+" "+c+" "+c);
            System.out.println(c+" "+c+" "+c+" "+"  ");
            System.out.println(c+" "+c+" "+"    ");
            System.out.println(c+"      ");
            break;
            case 4 :
            System.out.println("      "+c);
            System.out.println("    "+c+" "+c+" ");
            System.out.println("  "+c+" "+c+" "+c);
            System.out.println(c+" "+c+" "+c+" "+c);
            System.out.println("  "+c+" "+c+" "+c);
            System.out.println("    "+c+" "+c);
            System.out.println("      "+c);
            break;
        }

    }
}
