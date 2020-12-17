package T3.Tarea1_Funciones;

import java.util.Scanner;

import static T3.Tarea1_Funciones.EnClase_FuncionesActividad7.esPrimo;

public class EnClase_FuncionesActividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero "+num+" tiene "+cantidadPrimos(num)+" numeros divisibles primos");
    }
    public static int cantidadPrimos(int num){
        int suma=0;
        for (int i = 2; i <num ; i++) {
            if(esPrimo(i)){
                if(num%i==0){
                    suma++;
                }
            }
        }
        return suma;
    }

}
