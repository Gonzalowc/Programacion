package com.Libro2;

import java.util.Scanner;

public class Pag49_Ejercicio45_Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio=0,area;
        final double envio = 3.25;
        double escudo = 0;
        System.out.printf("Introduzca la altura de la bandera en cm: ");
        int altura = sc.nextInt();
        System.out.printf("Introduzca la anchura de la bandera en cm: ");
        int anchura = sc.nextInt();
        System.out.printf("¿Quiere escudo bordado?(s/n): ");
        sc.nextLine();
        String bordado = sc.nextLine().toLowerCase();
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");

        area = altura*anchura;

        if(bordado.equals("s")){
            escudo = 2.5;
            precio = (area/100)+envio+escudo;
        }
        if(bordado.equals("n")){
            precio = (area/100)+envio+escudo;
        }

        System.out.printf(" %-22s %8.2f€ \n", "Bandera de  "+(int)area+" cm2:",area/100);
        System.out.printf(" %-22s %8.2f€ \n","Escudo:", escudo);
        System.out.printf(" %-22s %8.2f€ \n","Gastos de envío:", envio);
        System.out.printf(" %-22s %8.2f€ \n","Total:", precio);
    }
}
