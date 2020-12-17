package T3.Tarea4_Tablas;

import java.util.Arrays;

public class Ej12_insertar_detras {
    public static void main(String[] args) {
        int[] vector = {1,1,1,1,1}; //5
        vector = insertarFinal(5,vector);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] insertarFinal(int num, int[] v){
        int[] aux = new int[v.length+1];
        for (int i = 0; i < v.length; i++) {
            aux[i] = v[i];
        }
        aux[aux.length-1]=num;
        return aux;
    }
}
