package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Pt2_Ej8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*101);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(filtrarPorPrimo(vector)));
    }
    public static int[] filtrarPorPrimo(int[] v){
        int[] resultado = new int[0];
        for (int i = 0; i <v.length ; i++) {
            if(!esPrimos(v[i])){
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = v[i];
            }
        }
        return resultado;
    }
    public static boolean esPrimos(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
