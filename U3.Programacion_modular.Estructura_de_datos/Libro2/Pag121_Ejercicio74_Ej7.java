package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag121_Ejercicio74_Ej7 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*21);
        }
        NumCambiados(vector);
    }
    public static void NumCambiados(int[] v){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }
        System.out.println();
        System.out.println("Introduce el valor que se encuentra en el array");
        int primer = sc.nextInt();
        System.out.println("Introduce el valor que se cambiará  por el anterior en el array");
        int segundo = sc.nextInt();

        for (int i = 0; i <v.length ; i++) {
            if(v[i]==primer){
                v[i]=segundo;
                System.out.print(" '"+v[i]+"' ");
            }else{
                System.out.print(v[i]+" ");
            }
        }
        System.out.println();
    }
}
