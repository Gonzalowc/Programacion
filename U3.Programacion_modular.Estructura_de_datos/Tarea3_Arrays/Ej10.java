package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(tabla));
        System.out.println(cantImpar(tabla));
        tabla = rellenaPares(tabla);
        System.out.println(Arrays.toString(tabla));
    }
    public static int cantImpar(int[] t){
        int impar=0;
        int[] aux = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if(t[i]%2==1){
                impar++;
            }
        }
        return impar;
    }
    public static int[] rellenaPares(int[] t){
        int numeros=0;
        int[] aux = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if(t[i]%2==0){
                aux[numeros] =t[i];
                numeros++;
            }
        }
        t = new int[numeros];
        for (int i = 0; i < t.length; i++) {
            t[i] = aux[i];
        }
        return t;
    }
}
