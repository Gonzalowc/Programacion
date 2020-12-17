package T3.Tarea1_Funciones;

import java.util.Scanner;
import static T3.Tarea1_Funciones.EnClase_FuncionesEj1.esPrimo;

public class EnClase_FuncionesActividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        divisoresPrimos(num);
    }
    public static void divisoresPrimos(int num){
        for (int i = 2; i <num; i++) {
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}