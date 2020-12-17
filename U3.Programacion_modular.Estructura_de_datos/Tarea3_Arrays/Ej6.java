package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;

        System.out.println("Introduce la cantidad de datos a introducir: ");
        cantidad = sc.nextInt();
        Integer[] t = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce numero ["+i+"]: ");
            t[i] = sc.nextInt();
        }
        int[] v;
        v = sinRepetidos(t);
        System.out.println(Arrays.toString(v));
    }



    public static int[] sinRepetidos(Integer[] t){
        Integer[] medio = new Integer[t.length];
        int cont=0;
        for (int i = 0; i < t.length; i++) {
            for (int j = i+1; j < t.length; j++) {
                if(t[i]==t[j] && t[j]!=null){
                    t[j]=null;
                }
            }
            if(t[i]!=null){
                medio[cont] = t[i];
                cont++;
            }
        }
        int[] resultado = new int[cont];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = medio[i];
        }
        return resultado;
    }
}