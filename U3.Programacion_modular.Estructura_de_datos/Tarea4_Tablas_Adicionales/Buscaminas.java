package learn.entregableAZUL;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JugarBuscaminas();
    }

    public static String[][] buscaminas(int dimension){
        String[][] buscaminas = new String[dimension][dimension];

        for (int i = 0; i <buscaminas.length ; i++) {
            for (int j = 0; j < buscaminas[0].length; j++) {
                if((int)(Math.random()*10) <5){
                    buscaminas[i][j] = "-";
                }else{
                    buscaminas[i][j] = "X";
                }
            }
        }
        return buscaminas;
    }

    public static int numMinas(String[][] v,int PosI, int PosJ){
        int cantidad=0;
        for (int i = 0; i <v.length ; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if (i+1>=PosI && i<=PosI+1  && j+1>=PosJ && j<=PosJ+1 && (i!=PosI || j!=PosJ)){
                    if(v[i][j].equals("X")){
                        cantidad++;
                    }
                }
            }
        }
        return cantidad;
    }

    public static void JugarBuscaminas(){
        Scanner sc = new Scanner(System.in);
        int dimension;

        do{
            System.out.println("Dimensión del Buscaminas: ");
            dimension = sc.nextInt();
        }while(dimension<=3);

        String[][] vector = buscaminas(dimension);

        for (int i = 0; i <vector.length ; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
        int fila, columna;
        do{
            System.out.println("Introduce la fila:(0 - "+(dimension-1)+")");
            fila = sc.nextInt();
            System.out.println("Introduce la columna:(0 - "+(dimension-1)+")");
            columna = sc.nextInt();
            if(vector[fila][columna].equals("-")){
                System.out.println(numMinas(vector,fila,columna));
            }
        }while(vector[fila][columna].equals("-"));
        System.out.println("BOOM!");
    }
}
