package T3.Libro;

import java.util.Arrays;

public class discoduroderoer_Ej10 {
    public static void main(String[] args) {
        int[][] a,b,resultado;
        a = rellenarArray(2,3);
        b = rellenarArray(2,3);
        resultado = new int[2][3];
        sumaArrays(resultado,a,b);
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(resultado));
    }
    public static int[][] rellenarArray(int altura, int anchura){
      int[][] v = new  int[altura][anchura];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] =(int)(Math.random()*10);
            }
        }
        return v;
    }
    public static void sumaArrays(int[][] suma, int[][] a, int[][] b){
        if(suma.length>=a.length && suma.length>=b.length && suma[0].length>=a[0].length && suma[0].length>=b[0].length)
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                if(i<a.length && i<b.length && j<a[0].length && j<b[0].length){
                    suma[i][j] = a[i][j]+b[i][j];
                }
            }
        }else{
            System.out.println("Array resultado menor que los que se suman");
        }
    }
}
