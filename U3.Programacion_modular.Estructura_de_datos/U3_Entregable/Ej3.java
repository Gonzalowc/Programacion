package entregable2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho;
        int alto;
        do{
            System.out.println("Introduce la longitud del vector(ancho)");
            ancho = sc.nextInt();
        }while(ancho<1);
        do{
            System.out.println("Introduce la longitud del vector(ancho)");
            alto = sc.nextInt();
        }while(alto<1);

        int[][] vector = /*{{1,  2,  3,  4, 5},
                          {12, 13 ,14, 15, 6 },
                          {11,  10,  9,  8, 7}};*/ new int[ancho][alto];

        for (int i = 0; i <vector.length ; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j] = (int)(Math.random()*101);
            }
        }


        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
        System.out.println(Arrays.toString(corteza(vector)));
    }

    public static int[] corteza(int[][] n){
        int[] resultado = new int[0];
        //superior
        for (int i = 0; i <n[0].length ; i++) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1]=n[0][i];
        }
        //System.out.println(Arrays.toString(resultado));
        //lateral derecho
        for (int i = 1; i < n.length; i++) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1]=n[i][n[0].length-1];
        }
        //System.out.println(Arrays.toString(resultado));
        //inferior
        for (int i = n[0].length-2; i >0 ; i--) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1]= n[n.length-1][i];
        }
        //System.out.println(Arrays.toString(resultado));
        //lateral izquierdo
        for (int i = n.length-1; i >0 ; i--) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1]= n[i][0];
        }
        //System.out.println(Arrays.toString(resultado));
       return  resultado;

    }
}
