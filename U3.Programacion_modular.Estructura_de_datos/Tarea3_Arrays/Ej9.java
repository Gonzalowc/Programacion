package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] primitiva = new int[6];
        int[] correcta = {5,10,30,45,60,95};//new int[6];
        for (int i = 0; i < primitiva.length; i++) {
            System.out.printf("Introduce tu número de voleto: ");
                primitiva[i] = sc.nextInt();
                correcta[i] = (int)(Math.random()*(100));
        }
        Arrays.sort(primitiva);
        Arrays.sort(correcta);
        System.out.print(Arrays.toString(primitiva)+"\n");
        System.out.print(Arrays.toString(correcta)+"\n");
        System.out.println(primitiva(primitiva,correcta));
    }
    public static int primitiva(int[] voleto, int[]buena){
        int cont=0;
        for (int i = 0; i < voleto.length; i++) {
            if(voleto[i] == buena[i]){
                cont++;
            }
        }
        return cont;
    }
}
