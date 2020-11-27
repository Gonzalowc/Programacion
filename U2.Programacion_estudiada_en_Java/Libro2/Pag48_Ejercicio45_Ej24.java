package com.Libro2;

import java.util.Scanner;

public class Pag48_Ejercicio45_Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=0, dieta;
        double bruto, neto,IRPF, IRPFpor=0;
        System.out.println("1 - Programador junior\n2- Prog. senior\n3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();
        System.out.print("¿Cúantos días ha estado de viaje visitando clientes?: ");
        int dias = sc.nextInt();
        System.out.print("Introduzca su estado Civil\n1 - Soltero\n2 - Casado\n : ");
        int civil = sc.nextInt();

        switch (cargo){
            case 1:
                base = 950;
                break;
            case 2:
                base = 1200;
                break;
            case 3:
                base = 1600;
                break;
            default:
                System.out.println("Introduzca un puesto válido");
        }
        dieta = dias*30;
        switch (civil){
            case 1:
                IRPFpor=25;
                break;
            case 2:
                IRPFpor=20;
                break;
            default:
                System.out.println("Introduzca un estado civil válido");
        }
        bruto = base+dieta;
        IRPF = bruto*(IRPFpor/100);
        neto = bruto-IRPF;

        System.out.printf("%34s\n", "----------------------------------");
        System.out.printf("| %-21s %8.2f |\n","Sueldo base",(double)base);
        System.out.printf("| %-21s %8.2f |\n","Dietas ( "+dias+" viajes)", (double)dieta);
        System.out.printf("%34s\n", "|--------------------------------|");
        System.out.printf("| %-21s %8.2f |\n","Sueldo bruto", bruto);
        System.out.printf("| %-21s %8.2f |\n","Retención IRPF ("+(int)IRPFpor+"%)", IRPF);
        System.out.printf("%34s\n", "|--------------------------------|");
        System.out.printf("| %-21s %8.2f |\n","Sueldo neto", neto);
        System.out.printf("%34s", "----------------------------------");
    }
}