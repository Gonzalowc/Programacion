package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce el inicio: ");
        int init = sc.nextInt();
        System.out.printf("Introduce el inicio: ");
        int fin = sc.nextInt();

        bucle(init,fin);

    }
    public static void bucle(int init, int fin){
        for (int j = init; j <=fin ; j++) {
            System.out.println(j);
        }
    }
}
