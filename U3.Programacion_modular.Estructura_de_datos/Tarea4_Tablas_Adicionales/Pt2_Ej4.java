package T3.Tarea4_Tablas_Adicionales;

import java.util.Scanner;

public class Pt2_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector ={1,2,3,4,5,6};
        System.out.println(convierteArrayEnString(vector));
    }
    public static String convierteArrayEnString(int[] a){
        String numeros="";

        for (int i = 0; i < a.length; i++) {
            numeros+=a[i];
        }
        return numeros;
    }

}
