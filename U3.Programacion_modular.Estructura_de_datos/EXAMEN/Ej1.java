package EXAMEN;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7};
        int[] b = {3,2,6};

        System.out.println(Arrays.toString(unirSinRepetidos(a,b)));
    }

    public static boolean esta(int[] vector, int num){

        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] resultado = new int[0];

        for (int i = 0; i < v1.length; i++) {
            if(!esta(resultado,v1[i])){
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = v1[i];
            }
        }
        for (int i = 0; i < v2.length; i++) {
            if(!esta(resultado,v2[i])){
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = v2[i];
            }
        }
        return resultado;

    }

}
