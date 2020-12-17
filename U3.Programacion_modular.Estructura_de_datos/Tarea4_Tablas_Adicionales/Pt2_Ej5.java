package T3.Tarea4_Tablas_Adicionales;

import java.util.Scanner;

public class Pt2_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector={1,2,3,4,5};

        System.out.println(aleatorioDeArray(vector));
    }
    public static int aleatorioDeArray(int[] a){
        int aleatorio = (int)(Math.random()*a.length);

        return a[aleatorio];

    }
}
