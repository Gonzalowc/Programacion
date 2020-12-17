package T3.Tarea4_Tablas;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cant_num;
        System.out.printf("Introduce cuantos numeros quieres meter: ");
        cant_num = sc.nextInt();
        int num[] = new int[cant_num];

        for (int i = 0; i < cant_num; i++) {
            System.out.println("Introduce numeros: ");
            num[i] = sc.nextInt();
        }
        for (int i = cant_num-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }
    }
}
