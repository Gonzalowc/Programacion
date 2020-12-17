package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] palabras = new String[8];
        String[] palabrasOrden = new String[palabras.length];
        String[] colores = new String[0];
        String[] auxPalabras = new String[0];


        for (int i = 0; i < palabras.length; i++) {
            System.out.println("INtroduce palabra");
            palabras[i] = sc.nextLine();

            if(escolor(palabras[i])){
                colores = Arrays.copyOf(colores, colores.length+1);
                colores[colores.length-1] = palabras[i];
            }else{
                auxPalabras = Arrays.copyOf(auxPalabras, auxPalabras.length+1);
                auxPalabras[auxPalabras.length-1] = palabras[i];
            }
        }
        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(auxPalabras));

        for (int i = 0; i < colores.length; i++) {
            palabras[i] = colores[i];
        }
        for (int i = 0; i <auxPalabras.length ; i++) {
            palabras[colores.length+i] = auxPalabras[i];
        }
        System.out.println(Arrays.toString(palabras));

    }
    public static boolean escolor(String palabra){
        String[] colores  ={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro","blanco" , "morado"};

        for (int i = 0; i < colores.length; i++) {
            if(palabra.equals(colores[i])){
                return true;
            }
        }
        return false;
    }
}
