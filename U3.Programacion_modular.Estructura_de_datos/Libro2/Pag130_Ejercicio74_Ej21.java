package T3.Libro2;

import java.util.Arrays;

public class Pag130_Ejercicio74_Ej21 {
    public static void main(String[] args) {
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*501);
        }
        System.out.println(Arrays.toString(numeros));
        circuerizado(numeros,5);
        System.out.println(Arrays.toString(numeros));
    }
    public static boolean multiploDeNum(int numero,int multiplo){

        if(numero%multiplo==0){
            return true;
        }else{
            return false;
        }
    }
    public static int siguienteMultiplo(int num,int multiplo){

        while(num%multiplo!=0){
            num++;
        }
        return num;

    }

    public static void circuerizado(int[] v, int multiplo){

        for (int i = 0; i <v.length ; i++) {
            if(!multiploDeNum(v[i],multiplo)){
                v[i] = siguienteMultiplo(v[i],multiplo);
            }
        }

    }
}
