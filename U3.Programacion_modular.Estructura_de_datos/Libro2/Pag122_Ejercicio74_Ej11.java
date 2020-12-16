package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag122_Ejercicio74_Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numeros: ");
            numeros[i] = sc.nextInt();
        }
        ordenP_NP(numeros);
        System.out.println(Arrays.toString(numeros));

    }
    public static void ordenP_NP(int[] v){

        int cuentaintercambios=0;

        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<v.length-1;i++){
                if (!esPrim(v[i]) && esPrim(v[i+1])){
                    //Intercambiamos valores
                    int variableauxiliar=v[i];
                    v[i]=v[i+1];
                    v[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }

    }
    public static boolean esPrim(int num){

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
