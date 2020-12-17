package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10_otra_forma {
    public static void main(String[] args) {
        int[] a = new int[10];

        System.out.println(rellenaPares(a));
        System.out.println(Arrays.toString(a));
    }

    public static int rellenaPares(int[] a) {
        Scanner sc = new Scanner(System.in);

        int datos, contador;

        datos = 0;
        contador = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce los datos de la tabla");
            datos = sc.nextInt();

            if (datos%2==0) {
                a[i] = datos;
            } else {
                i--;
                contador++;
            }

        }

        System.out.println(Arrays.toString(a));

        return contador;
    }

}
