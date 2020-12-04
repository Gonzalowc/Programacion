package entregable2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura,anchura;

        do{
            System.out.println("Introduce la altura");
            altura=sc.nextInt();

        }while (altura<1);
        do{
            System.out.println("Introduce la altura");
            anchura=sc.nextInt();
        }while(anchura<1);
        int[][] vector;
        vector = arrayBidiSinRepetidos(altura,anchura);

        maxYmin(vector);


    }

    public static void maxYmin(int[][] v){
        String mensajeMin = "", mensajeMax="";
        int min=0, max=0;

        for (int i = 0; i <v.length ; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if(i==0 && j==0){
                  min=v[0][0];
                  max=v[0][0];
                }
                if(max<v[i][j]){
                    max=v[i][j];
                    mensajeMax="["+i+"]"+"["+j+"]";
                }
                if(min>v[i][j]){
                    min=v[i][j];
                    mensajeMin="["+i+"]"+"["+j+"]";
                }
            }
        }
        System.out.println("Posición minimo: "+mensajeMin);
        System.out.println("Posición maximo: "+mensajeMax);
    }
    public static int[][] arrayBidiSinRepetidos(int anchura, int altura){

        int[][] vector = new int[altura][anchura];
        int num;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                do{
                    num = (int)((Math.random()*901)+100);
                    if(num==100 || num ==1000){
                        System.out.println(num);
                    }
                }while(contieneEnArray(vector,num, i, j));
                vector[i][j]=num;
            }
        }
        return vector;
    }
    public static boolean contieneEnArray(int[][] v, int num,int alturaMax,int anchuraMax){
        for (int i = 0; i < alturaMax; i++) {
            for (int j = 0; j < v.length ; j++) {
                if(v[i][j]==num){
                    return true;
                }
            }
        }
        for (int j = 0; j < anchuraMax; j++) {
            if(v[alturaMax][j]==num){
                return true;
            }
        }
        return false;
    }
}
