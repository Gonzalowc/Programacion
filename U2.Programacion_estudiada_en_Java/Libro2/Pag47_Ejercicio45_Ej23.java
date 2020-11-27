package com.Libro2;

import java.util.Scanner;

public class Pag47_Ejercicio45_Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String promo, tipIVA;
        double descuentoNum=0, base,tipoIVA=0, total=0,precioIVA=0;

        System.out.printf("Introduzca la base imponible: ");
        base = sc.nextDouble();
        base = (double)Math.round(base * 100d)/100d;
        sc.nextLine();
        System.out.printf("Introduzca el tipo de IVA(general, reducido o superreducido): ");
        tipIVA = sc.nextLine().toLowerCase();
        System.out.printf("Introduzca el código promocional (nopro, mitad, meno5,5porc): ");
        promo = sc.nextLine().toLowerCase();

        switch (tipIVA){
            case "general":
                tipoIVA= 0.21;
                break;
            case "reducido":
                tipoIVA = 0.1;
                break;
            case "superreducido":
                tipoIVA=0.04;
                break;
            default:
                System.out.printf("Introduce bien el tipo de IVA\n");
        }
        switch (promo){
            case "nopro":
                precioIVA = ((base +(tipoIVA * base))*100d)/100d;
                total = (precioIVA*100d)/100d;
                break;
            case "mitad":
                precioIVA = ((base +(tipoIVA * base))*100d)/100d;
                descuentoNum = (((precioIVA/2)*100d)/100d)*-1;
                total = ((precioIVA/2)*100d)/100d;
                break;
            case "meno5":
                precioIVA = ((base +(tipoIVA * base))*100d)/100d;
                descuentoNum = -(5*100d)/100d;
                total = precioIVA+descuentoNum;
                break;
            case "5porc":
                precioIVA = ((base +(tipoIVA * base))*100d)/100d;
                descuentoNum = (((precioIVA*0.05)*100d)/100d)*-1;
                total = precioIVA + descuentoNum;
                break;
            default:
                System.out.printf("Introduce bien el código");
        }
        if(tipoIVA!=0 && (promo.equals("nopro") || promo.equals("mitad")
                || promo.equals("meno5") || promo.equals("5porc"))){
            System.out.printf("%-20s %5.2f\n","Base imponible" ,base);
            System.out.printf("%-20s %5.2f\n","IVA ("+(int)(tipoIVA*100)+"%)" ,base*tipoIVA);
            System.out.printf("%-20s %5.2f\n","Precio con IVA" ,precioIVA);
            System.out.printf("%-20s %5.2f\n","Cód. promo. ("+promo+")" ,descuentoNum);
            System.out.printf("%-20s %5.2f","TOTAL" ,total);
        }
    }
}
