package T3.Libro2;

import java.util.Arrays;

public class Pag120_Ejercicio74_Ej4 {
    public static void main(String[] args) {

        long[] numero = new long[20];
        long[] cuadrado = new long[20];
        long[] cubo = new long[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (long)(Math.random()*101);
            cuadrado[i] = (long)(Math.pow(numero[i],2));
            cubo[i] = (long)(Math.pow(numero[i],3));
        }
        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(cuadrado));
        System.out.println(Arrays.toString(cubo));
    }
}
