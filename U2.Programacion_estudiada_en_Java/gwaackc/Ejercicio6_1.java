package com.gwaackc;

import java.util.Scanner;

public class Ejercicio6_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.printf("Introduce el numero del Mes: ");
        n1 = sc.nextInt();
        if((n1>0) && (n1<13)){
            System.out.printf("El numero de mes " + n1 +" es el mes de: ");
        }

        switch (n1){
            case 1: System.out.printf("Enero"); break;
            case 2: System.out.printf("Febrero"); break;
            case 3: System.out.printf("Marzo"); break;
            case 4: System.out.printf("Abril"); break;
            case 5: System.out.printf("Mayo"); break;
            case 6: System.out.printf("Junio"); break;
            case 7: System.out.printf("Julio"); break;
            case 8: System.out.printf("Agosto"); break;
            case 9: System.out.printf("Septiembre"); break;
            case 10: System.out.printf("Octubre"); break;
            case 11: System.out.printf("Noviembre"); break;
            case 12: System.out.printf("Diciembre"); break;
            default: System.out.printf("No hay mes "+ n1);
        }
    }
}
