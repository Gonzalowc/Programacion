package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag127_Ejercicio74_Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int pos, num_ant=0, num_sig=0;
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = (int)(Math.random()*201);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Que numero quiere introducir?");
        int num = sc.nextInt();
        do{
            System.out.println("Que posición lo quiere colocar?(0-11)");
            pos = sc.nextInt();
        }while(pos<0 || pos>11);


        for (int i = pos; i < numeros.length; i++) {
            if(i==pos){
                num_ant=numeros[i];
                numeros[i]=num;
            }else{
                num_sig=numeros[i];
                numeros[i] = num_ant;
                num_ant=num_sig;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
