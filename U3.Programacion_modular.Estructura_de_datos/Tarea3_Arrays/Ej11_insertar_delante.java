package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11_insertar_delante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = {1, 1, 1, 1, 1, 1}; //6
        vector = insertarPrimero(3,vector);
        vector = insertarPrimero(3,vector);
        vector = insertarPrimero(3,vector);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] insertarPrimero(int num, int[] v){
        int[] aux = new int[v.length+1];
        for (int i = 0; i <aux.length; i++) {
            if(i==0){
                aux[i]=num;
            }else{
                aux[i] = v[i-1];
            }
        }
        return aux;
    }
}
