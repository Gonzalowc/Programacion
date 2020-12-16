package T3.Libro;

import java.util.Arrays;

public class Pag152_Ej5_2 {
    public static void main(String[] args) {
        int[] vector = {3,5,1,4};
        int[] indices;
        indices = tablaConIndices(vector);
        System.out.println(Arrays.toString(indices));
    }
    public static int[] tablaConIndices(int[] vector){
        int[] aux = Arrays.copyOf(vector,vector.length);
        Arrays.sort(aux);
        int[] index = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if(vector[j]==aux[i]){
                    index[i]=j;
                }
            }
        }
        return index;
    }
}
