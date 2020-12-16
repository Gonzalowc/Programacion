package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag128_Ejercicio74_Ej120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos reyes quieres introducir?");
        int cant = sc.nextInt();
        String[] nombres = new String[cant];
        sc.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce nombre de rey: ");
            nombres[i] = sc.nextLine();
        }
            cantidadEnArray(nombres);

        System.out.println(Arrays.toString(nombres));
    }

    public static void cantidadEnArray(String[] v){
        int cantidad=1;
        int[] aux = new int[v.length];
        String[] auxNombres = Arrays.copyOf(v,v.length);
        for (int i = 0; i < v.length; i++) {
            cantidad=1;
            if(v[i]!=null){
                for (int j = i; j < v.length; j++) {
                    if(v[i].equals(v[j])){
                        aux[j] = cantidad;
                        cantidad++;
                        if(j!=i){
                            v[j]=null;
                        }
                    }
                }

            }
            v[i]=null;
        }
        for (int i = 0; i < v.length; i++) {
            v[i] = auxNombres[i]+aux[i]+"º";
        }
    }
}
