package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag121_Ejercicio74_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosSinOrden = new int[20];
        int[] Pares = new int[0];
        int[] Impares = new int[0];;
        for (int i = 0; i < numerosSinOrden.length; i++) {
            numerosSinOrden[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i < numerosSinOrden.length; i++) {
            if(numerosSinOrden[i]%2==0){
                Pares = Arrays.copyOf(Pares,Pares.length+1);
                Pares[Pares.length-1] = numerosSinOrden[i];
            }else{
                Impares = Arrays.copyOf(Impares,Impares.length+1);
                Impares[Impares.length-1] = numerosSinOrden[i];
            }
        }
        for (int i = 0; i < Pares.length; i++) {
                numerosSinOrden[i]=Pares[i];
        }
        for (int i = 0; i < Impares.length; i++) {
            numerosSinOrden[Pares.length+i]=Impares[i];
        }
        System.out.print(Arrays.toString(Pares));
        System.out.print(Arrays.toString(Impares));
        System.out.println();
        System.out.println(Arrays.toString(numerosSinOrden));
    }
}
