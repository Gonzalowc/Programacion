package T3.Libro;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Pag152_Ej5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] sueldo = {};
        Integer dinero;
        double suma=0;
        int contador=0;
        do{
            System.out.println("Introduce el sueldo: ");
            dinero= sc.nextInt();
            if(dinero!=-1){
                suma+=dinero;
                    sueldo = Arrays.copyOf(sueldo,sueldo.length+1);
                sueldo[contador]=dinero;
                contador++;
            }
        }while(dinero!=-1);

        int max = sueldo[0];
        int min = sueldo[0];

        for (int i = 1; i < sueldo.length; i++) {
            if(sueldo[i]>max){
                max = sueldo[i];
            }
            if(sueldo[i]<min){
                min=sueldo[i];
            }
        }
        Arrays.sort(sueldo, Collections.reverseOrder());
        System.out.println("Sueldos: "+Arrays.toString(sueldo));

        System.out.println("Total de sueldos: "+sueldo.length);
        System.out.println("Media de sueldos: "+suma/contador);
        System.out.println("Sueldo máximo: "+ max);
        System.out.println("Sueldo mínimo: "+ min);
    }
}
