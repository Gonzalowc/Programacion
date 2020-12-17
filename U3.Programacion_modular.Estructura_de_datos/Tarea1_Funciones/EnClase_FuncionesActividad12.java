package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero para su factorial: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        int factorial=1;
        for (int i = num; i >0 ; i--) {
            factorial=factorial*i;
        }
        return factorial;
    }
}
