package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag121_Ejercicio74_Ej6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] numeros = new int[15];
        int num_sig=0, num_ant=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numeros");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if(i==0){
                num_sig = numeros[i];
                numeros[i]=numeros[numeros.length-1];
            }else if(i<numeros.length-1){
                num_ant=numeros[i];
                numeros[i]=num_sig;
                num_sig=num_ant;
            }else{
                numeros[i] = num_sig;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
