package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class cuadraconcen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;

        do{
            System.out.println("Introduce el lado del cuadrado: ");
            longitud = sc.nextInt();
        }while(longitud%2==0);

        String[][] cuadrado = new String[longitud][longitud];

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[0].length; j++) {
                if(i%2==0 && j>=i && i+j<cuadrado.length ||
                        i%2==0 && i>=j && i+j>=cuadrado.length-1 ||
                   j%2==0 && j<=i && i+j<cuadrado.length-1 ||
                   j%2==0 && j>=i && i+j >cuadrado.length-1){
                    cuadrado[i][j]="X";
                }else{
                    cuadrado[i][j]="-";

                }
            }
        }
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.println(Arrays.toString(cuadrado[i]));
        }

    }
}
