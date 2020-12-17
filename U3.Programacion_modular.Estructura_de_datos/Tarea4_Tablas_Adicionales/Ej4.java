package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila=3, columna=3;
        int iniF,iniC;
        String[] columnas ={"a","b","c","d","e","f","g","h"};
        int[] filas = {8,7,6,5,4,3,2,1};


        //Diagonal sup-Derecha
        iniF=fila++;
        iniC=columna--;
        while(fila>=0 && columna<8 && columna>=0 && fila<8){
            System.out.println("FC: "+fila+""+columna);
            fila++;
            columna--;
        }
        //diagonal sup-izq
        iniF=fila--;
        iniC=columna--;
        while(fila>=0 && columna<8 && columna>=0 && fila<8){
            System.out.println("FC: "+fila+""+columna);
            fila--;
            columna--;
        }
        //ubf drcg
        iniF=fila++;
        iniC=columna++;
        while(fila>=0 && columna<8 && columna>=0 && fila<8){
            System.out.println("FC: "+fila+""+columna);
            fila++;
            columna++;
        }
        //
        iniF=fila--;
        iniC=columna++;
        while(fila>=0 && columna<8 && columna>=0 && fila<8){
            System.out.println("FC: "+fila+""+columna);
            fila--;
            columna++;
        }

    }
}
