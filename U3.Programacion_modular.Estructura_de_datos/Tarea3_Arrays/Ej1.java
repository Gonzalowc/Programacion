package T3.Tarea4_Tablas;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num[] = new double[5];

        for (int i =0; i <5 ; i++) {
            System.out.printf("Introduce numero: ");
            num[i] = sc.nextDouble();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(num[i]);
        }
    }
}
