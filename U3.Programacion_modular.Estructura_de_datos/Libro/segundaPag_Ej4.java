package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class segundaPag_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int[] numeros = new int[0];

        do{
            System.out.println("Introduce el número");
            num = sc.nextInt();
            if(num>=0){
                numeros = Arrays.copyOf(numeros,numeros.length+1);
                numeros[numeros.length-1] = num;
            }
        }while(num>=0 && numeros.length<10);
        System.out.println(Arrays.toString(numeros));
    }
}
