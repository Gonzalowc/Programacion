package T3.Tarea4_Tablas;

import java.util.Arrays;

public class matriz_suma_laterales {
    public static void main(String[] args) {
        int[][] vector= {{1,2,3},{4,5,6},{7,8,9}};
        vector = sudoku(vector);
        for (int i = 0; i <vector.length ; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
        //System.out.println(Arrays.deepToString(vector));

    }
    public static int[][] sudoku(int[][] v){
        int[][] aux = new int[v.length+1][v[0].length+1];
        int suma =0;
        for (int i = 0; i < v.length; i++) {
            int sumaHorizontal=0;
            for (int j = 0; j < v[i].length; j++) {
                sumaHorizontal+=v[i][j];
                aux[i][j]=v[i][j];
            }
            aux[i][v[i].length]= sumaHorizontal;
            suma+=sumaHorizontal;
        }

        for (int i = 0; i <v[0].length ; i++) {
            int sumaVertical=0;
            for (int j = 0; j < v.length; j++) {
                sumaVertical+=v[j][i];
            }
            aux[v.length][i]=sumaVertical;
        }
        aux[v.length][v[0].length]=suma;
        return aux;
    }
}
