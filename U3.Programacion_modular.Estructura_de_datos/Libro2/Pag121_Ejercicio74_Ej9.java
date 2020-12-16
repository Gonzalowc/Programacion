package T3.Libro2;

import java.util.Scanner;

public class Pag121_Ejercicio74_Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numeros: ");
            numeros[i] = sc.nextInt();
        }
        for (int num:numeros) {
            System.out.println(num+" "+esPar(num));
        }

    }
    public static String esPar(int num){
        String mensaje;

        mensaje = (num%2==0) ? "es Par" : "es Impar";

        return mensaje;
    }
}
