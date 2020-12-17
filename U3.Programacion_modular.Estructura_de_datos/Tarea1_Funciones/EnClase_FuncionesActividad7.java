package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero: ");
        int num = sc.nextInt();
        if(esPrimo(num)){
            System.out.println("Es Primo");
        }else{
            System.out.println("No es Primo");
        }
    }
    public static boolean esPrimo(int num){
        int contador=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                contador++;
            }
        }
        if(contador<=2){
            return true;
        }else{
            return false;
        }
    }
}
