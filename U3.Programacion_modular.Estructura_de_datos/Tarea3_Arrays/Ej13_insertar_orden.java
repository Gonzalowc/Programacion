package T3.Tarea4_Tablas;

import java.util.Arrays;

public class Ej13_insertar_orden {
    public static void main(String[] args) {
        int[] vector = {1,2,3,7,5,6};
        vector = insertarOrden(4, vector);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] insertarOrden(int num, int[] v){
        int[] aux = new int[v.length+1];
        Arrays.sort(v);
        int pos=0;
        for (int i = 0; i < v.length; i++) {
            if(num>v[i]){
                aux[i]=v[i];
                pos++;
            }else{
                aux[i+1]=v[i];
            }
        }
        aux[pos] = num;

        return aux;
    }
}
