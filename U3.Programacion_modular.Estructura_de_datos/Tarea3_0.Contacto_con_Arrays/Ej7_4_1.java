package T3.Tarea3_Cadenas.PaginaWeb;

import java.util.Scanner;

public class Ej7_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double media[] = new double[5];
        double resultado =0;

        for (int i = 0; i < media.length; i++) {
            System.out.printf("Introduce el "+(i+1)+"º número: ");
            numero = sc.nextInt();
            media[i]= numero;
        }
        for (int i = 0; i < media.length; i++) {

            resultado += media[i];
        }
        resultado = resultado/media.length;
        System.out.println("Media: "+resultado);
    }
}
