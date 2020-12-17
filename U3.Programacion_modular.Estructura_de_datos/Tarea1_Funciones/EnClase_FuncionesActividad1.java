package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce la repeticion de eco: ");
        int num = sc.nextInt();

        eco(num);
    }
    public static void eco(int num){
        for (int i = 0; i < 5; i++) {
            System.out.println("eco...");
        }
    }
}
