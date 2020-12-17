package T3.Tarea4_Tablas;
import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int[] numeros2 = new int[6];
        int[] completo = new int[numeros.length+numeros2.length];
        System.out.println("Introduce numeros");
        for (int i = 0; i < 6; i++) {
            System.out.println("Rellena el primer array: Pos["+i+"]");
            numeros[i]= sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Rellena el segundo array: Pos["+i+"]");
            numeros2[i]= sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("numeros: "+Arrays.toString(numeros));
        Arrays.sort(numeros2);
        System.out.println("numeros2: "+Arrays.toString(numeros2));
        int cont1=0, cont2=0;
        for (int i = 0; i < numeros.length; i++) {
            completo[i]=numeros[i];
        }
        int cont=0;
        for (int i = numeros.length; i < completo.length; i++) {
            completo[i]=numeros2[cont];
            cont++;
        }
        Arrays.sort(completo);
        System.out.println("Completo: "+Arrays.toString(completo));
    }
}