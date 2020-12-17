package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int min=0, max=0, buscar=0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int)(Math.random()*501);
            System.out.print(arr[i]+" ");
            if(i==0){
                min=arr[i];
                max=arr[i];
            }else{
                if(min>arr[i]){
                    min=arr[i];
                }
                if(max<arr[i]){
                    max=arr[i];
                }
            }
        }
        System.out.println();
        System.out.println("MIN: "+min+" MAX: "+max);
        do{
            System.out.println("Que quiere sacar?\n" +
                    "1.- Mínimo\n" +
                    "2.- Máximo");
            buscar = sc.nextInt();
            if(buscar!=1 && buscar!=2){
                System.out.println("Introduce una opción válida");
            }
        }while(buscar!=1 && buscar!=2);

        switch (buscar){
            case 1: buscar=min;
            break;
            case 2: buscar=max;
            break;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==buscar){
                System.out.print("**"+arr[i]+"**, ");
            }else if(i<arr.length-1){
                System.out.print(arr[i]+", ");
            }else{
                System.out.print(arr[i]);
            }
        }

    }
}
