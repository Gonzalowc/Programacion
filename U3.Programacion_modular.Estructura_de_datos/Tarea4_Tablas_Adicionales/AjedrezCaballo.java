package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class AjedrezCaballo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        int[] filas = {8,7,6,5,4,3,2,1};
        String[] columnas = {"a","b","c","d","e","f","g","h"};
        int filaInicial,columnaInicial;
        do{
            System.out.println("Introduce la fila que contiene alfil");
            filaInicial= sc.nextInt()-1;
            System.out.println("Introduce la columna que contiene alfil");
            columnaInicial= sc.nextInt()-1;
        }while(filaInicial<1 || filaInicial>8 || columnaInicial<1 || columnaInicial>8);


        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if(/*Recorrido (i== filaInicial && j>=columnaInicial-2 && j<=columnaInicial+2 )
                        ||*/ i==filaInicial-1 && j==columnaInicial-2 || i==filaInicial+1 && j==columnaInicial+2
                        || i==filaInicial+1 && j==columnaInicial-2 || i==filaInicial-1 && j==columnaInicial+2
                        /*Recorrido|| i>=filaInicial-2 && i<=filaInicial+2 && j==columnaInicial*/
                        || i==filaInicial-2 && j==columnaInicial+1|| i==filaInicial-2 && j==columnaInicial-1
                        || i==filaInicial+2 && j==columnaInicial+1|| i==filaInicial+2 && j==columnaInicial-1){
                    System.out.print(filas[i]+columnas[j]+" ");
                    tablero[i][j] = "X";
                }else{
                    tablero[i][j] = "-";
                }
            }
        }
        System.out.println();
        tablero[filaInicial][columnaInicial]="C";
        System.out.println(" "+ Arrays.toString(columnas));
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(filas[i]+Arrays.toString(tablero[i]));
        }
    }
}
