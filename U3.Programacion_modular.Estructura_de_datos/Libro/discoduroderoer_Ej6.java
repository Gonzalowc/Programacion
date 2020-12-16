package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class discoduroderoer_Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vector;
        int altura;
        int anchura;
        do{
            System.out.println("Introduce la altura: ");
            altura = sc.nextInt();
            System.out.println("Introduce la altura: ");
            anchura = sc.nextInt();
        }while(altura<1 || anchura<1);
        vector = vectorSinRepetidos(altura,anchura);
        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
    }

    public static int[][] vectorSinRepetidos(int altura, int anchura){
        int[][] vector = new int[altura][anchura];
        int num;
        for (int i = 0; i <vector.length ; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                do{
                    num = (int)(Math.random()*101);
                }while(seRepite(vector,num,i,j));
                vector[i][j]=num;
            }
        }
        return vector;
    }

    public static boolean seRepite(int[][] v,int num,int altura, int anchura){
        for (int i = 0; i <altura ; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if(v[i][j]==num){
                    return true;
                }
            }
        }
        for (int j = 0; j < anchura; j++) {
                if(v[altura][j]==num){
                    return true;
                }
        }
        return false;
    }
}
