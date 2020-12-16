package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag133_Ejercicio74AB_Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura, altura;
        /*do{
            System.out.println("Introduce la altura: ");
            altura = sc.nextInt();
            System.out.println("Introduce la anchura: ");
            anchura = sc.nextInt();
        }while(altura<1 || anchura<1);*/

        int[][] vector ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //new int[altura][anchura];
        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
        rotarVector(vector);
        System.out.println("_________________________");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
    }
    public static void rotarVector(int[][] vector){
        int[] aux = new int[0];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = vector[i][j];
            }
        }
        int anterior=0,posterior=0;
        for (int i = 0; i < aux.length; i++) {
            if(i==0){
                anterior=aux[i];
                aux[i]=aux[aux.length-1];
            }else{
                posterior=aux[i];
                aux[i]=anterior;
                anterior=posterior;
            }
        }
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j <vector[0].length ; j++) {
               vector[i][j]=aux[cont];
               cont++;
            }
        }

    }
}
