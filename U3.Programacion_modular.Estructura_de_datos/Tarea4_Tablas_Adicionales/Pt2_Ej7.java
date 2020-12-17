package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Pt2_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int fila, columna, tam;
        for (int i = 0; i <matriz.length ; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
               matriz[i][j] = (int)(Math.random()*21);
            }
        }
        for (int i = 0; i <matriz.length ; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        do{
            System.out.println("Introduce la posición inicial: Fila(0-9) ");
            fila = sc.nextInt();
        }while(fila<0 || fila>10);
        do{
            System.out.println("Introduce la posición inicial: Columna(0-9) ");
            columna = sc.nextInt();
        }while(columna<0 || columna>10);

        do{
            System.out.println("Introduce la dimensión de la matriz: ");
            tam = sc.nextInt();
        }while(fila+tam>matriz.length || columna+tam>matriz[0].length);
        int[][] subMatriz = new int[tam][tam];
        int di=0, dj=0;

        /*
        for (int i = fila; i <fila+tam ; i++) {
            for (int j = columna; j <columna+tam ; j++) {
                subMatriz[i-fila][j-columna] = matriz[i][j];
            }
            System.out.println();
        }
        */
        for (int i = fila; i <fila+tam ; i++) {
            dj=0;
            for (int j = columna; j <columna+tam ; j++) {
                System.out.print(matriz[i][j]+" ");
                subMatriz[di][dj] = matriz[i][j];
                dj++;
            }
            di++;
            System.out.println();
        }
        for (int i = 0; i <subMatriz.length ; i++) {
            System.out.println(Arrays.toString(subMatriz[i]));
        }

    }
}
