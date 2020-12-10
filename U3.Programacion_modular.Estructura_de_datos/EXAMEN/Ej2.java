package EXAMEN;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] numeros = new int[0];

        do{
            System.out.println("Introduce numeros(para salir menor que 0): ");
            num = sc.nextInt();
            if(num>=0){
                numeros = Arrays.copyOf(numeros,numeros.length+1);
                numeros[numeros.length-1]= num;
            }
        }while(num>=0);
        System.out.println("Números en Array"+Arrays.toString(numeros));
        System.out.println("Número en String: "+convierteArrayEnString(numeros));





    }
    public static String convierteArrayEnString(int[] a){
        String mensaje = "";
        for (int i = 0; i <a.length ; i++) {
            mensaje += a[i];
        }
        return mensaje;
    }
}
