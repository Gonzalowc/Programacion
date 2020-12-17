package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0, max=0, cont=0;
        int[][] arr = new int[10][10];
        long suma = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 200+(int)(Math.random()*101);
                if(i==0 && j==0){
                    min = arr[i][j];
                    max = arr[i][j];
                }
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
                if(i==j){
                    suma+=arr[i][j];
                    cont++;
                }
            }
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+ (double)suma/cont);
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
