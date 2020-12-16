package T3.Libro;

import java.util.Arrays;

public class Ej2_Extra {
    public static void main(String[] args) {
        int[][] vector = {{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
        int[][] vector3 = new int[vector[0].length][vector.length];

        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }

        int[][] vector2 = new int[vector[0].length][vector.length];
        System.out.println(Arrays.deepToString(vector2));
        for (int i = 0; i < vector.length ; i++) {
            for (int j = 0; j < vector[0].length ; j++) {
                    vector2[j][i]=vector[i][j];
            }
        }
        //__________________________________________________________
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length ; j++) {
                vector3[((j+vector[0].length)%vector[0].length)][((i+vector.length)%vector.length)] = vector[i][j];
            }
        }
        //__________________________________________________________
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(Arrays.toString(vector2[i]));
        }

        for (int i = 0; i < vector3.length; i++) {
            System.out.println(Arrays.toString(vector3[i]));
        }
    }
}
