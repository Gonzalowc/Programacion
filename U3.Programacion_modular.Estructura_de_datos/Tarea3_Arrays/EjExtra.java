package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class EjExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[6];
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("Introduce el "+(i+1)+"ºn: ");
            tabla[i] = sc.nextInt();
        }
        System.out.println("¿Que valor desea quitar?");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(tabla));
        tabla = quitarNums(num,tabla);
        System.out.println(Arrays.toString(tabla));
    }
    public static int[] quitarNums(int valor, int[] vector){
        int[] aux = new int[vector.length];
        int aux2=0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]!=valor){
                aux[aux2]=vector[i];
                aux2++;
            }
        }
        vector = new int[aux2];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=aux[i];
        }
        return vector;
    }
}
