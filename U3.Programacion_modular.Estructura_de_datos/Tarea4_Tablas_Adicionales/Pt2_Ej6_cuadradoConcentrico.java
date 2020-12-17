package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

//cuadrados concentricos.
public class Pt2_Ej6_cuadradoConcentrico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        do{
            System.out.println("Indica la longitud del cuadrado: ");
            longitud = sc.nextInt();
        }while(longitud%2==0);
        String[][] cuadradoConcentrico = new String[longitud][longitud];

        for (int i = 0; i <cuadradoConcentrico.length ; i++) {

            for (int j = 0; j < cuadradoConcentrico[0].length; j++) {

                if (i%2==0 && j>=i && i+j<cuadradoConcentrico.length ||
                i+j>=cuadradoConcentrico.length-1 && i%2==0 && i>=j ||
                j%2==0 && j<=i && i+j<cuadradoConcentrico.length-1 ||
                j%2==0 && j>=i && i+j>cuadradoConcentrico.length-1){

                    cuadradoConcentrico[i][j]="x";

                }else{

                    cuadradoConcentrico[i][j]=" ";
                }
            }
        }

        /*for (int i = 0; i <cuadradoConcentrico.length ; i++) {
            System.out.println(Arrays.toString(cuadradoConcentrico[i]));

        }*/
        for (String[] vector : cuadradoConcentrico) {
            for (String simbolo : vector){
                System.out.print(" "+simbolo+" ");
            }
            System.out.println();
        }

    }
}
