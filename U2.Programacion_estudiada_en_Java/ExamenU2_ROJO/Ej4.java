package com.gwaackc;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puesto=0, estado=0, sueldo=0, dias, bruto,total=0, dietas;
        double IRPF=0;
        do{
            System.out.println("1 - Prog. junior\n2 - Prog. senior\n3 - Jefe de proyecto");
            puesto = sc.nextInt();
        }while(puesto<1 || puesto>3);
        System.out.println("¿Cuantos dias ha estado de viaje?: ");
        dias = sc.nextInt();
        do{
            System.out.println("1 - Soltero\n2 - Casado");
            estado = sc.nextInt();
        }while(estado<1 || estado>2);
        switch (puesto){
            case 1:
                sueldo= 950;
                break;
            case 2: sueldo=1200;
                break;
            case 3: sueldo = 1600;
                break;
        }
        switch (estado){
            case 1:
                IRPF = 20;
                break;
            case 2:
                IRPF=25;
                break;
        }
        dietas = dias*30;

        bruto  = sueldo+dietas;
        total = (int)(bruto-bruto*(IRPF/100));
        System.out.println("Sueldo base: "+(double)sueldo);
        System.out.println("Dietas ("+dias+" viajes): "+ (double)dietas);
        System.out.println("Sueldo bruto: "+ (double)bruto);
        System.out.println("Retencion IRPF ("+(int)IRPF+")%: "+(double)bruto*(IRPF/100) );
        System.out.println("Sueldo neto: "+ (double)total);
    }
}
