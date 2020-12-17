package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[6][10];
        int min=0,max=0;
        boolean encontrado=false;
        String posicionMax="", posicionMin="";
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                do{
                    numeros[i][j]= (int)(Math.random()*(1001));
                }while(!seEncuentra(numeros,numeros[i][j],i,j));
                if(i==0 && j==0){
                    min = numeros[i][j];
                    max = numeros[i][j];
                }else {
                    if(min>numeros[i][j]){
                        posicionMin="";
                        posicionMin="F:"+(i+1)+" C:"+(j+1);
                        min = numeros[i][j];
                    }
                    if(max<numeros[i][j]){
                        posicionMax="";
                        posicionMax="F:"+(i+1)+" C:"+(j+1);
                        max = numeros[i][j];
                    }
                }

            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Arrays.toString(numeros[i]));
        }
        System.out.println("Posición Máxima: "+posicionMax);
        System.out.println("Posición Mínima: "+posicionMin);
    }

    public static boolean seEncuentra(int[][] array, int num,int posFila, int posColumna){

        for (int i = 0; i <=posFila ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j]==num){
                    return true;
                }
                if(i==posFila && j>=posColumna){
                    break;
                }

            }
        }
        return false;
    }
}

