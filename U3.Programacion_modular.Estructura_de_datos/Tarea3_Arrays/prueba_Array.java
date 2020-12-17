package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class prueba_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] v1 = new Integer[10];
        Integer[] v2 = {2,3,4,5,6,7,8};
        Integer[] v3,v4=new Integer[v1.length+v2.length];
        System.out.println(lleno(v1) ? "LLENO": "HUECOS");
        System.out.println(lleno(v2) ? "LLENO": "HUECOS");


        int cont=0,cont2=0;
        v3 = unir(v1,v2);
        System.out.println("V3: "+ Arrays.toString(v3));
        for (int i = 0; i <v3.length; i++) {
            if(v3[i]==null){
                cont++;
            }else{
                v4[cont2]=v3[i];
                cont2++;
            }
        }
        v3 = new Integer[v3.length-cont];
        for (int i = 0; i < v3.length; i++) {
            v3[i]=v4[i];
        }
        System.out.println("V3: "+ Arrays.toString(v3));

    }
    public static boolean lleno(Integer[] v) {
        for (int i = 0; i < v.length; i++) {
            if(v[i]==null){
                return false;
            }
        }
        return true;
    }

    public static Integer[] unir(Integer[] v, Integer[] v2){
        Integer[] resultado = new Integer[v.length+v2.length];
        for (int i = 0; i < v.length; i++) {
                resultado[i]=v[i];
        }
        for (int i = 0; i <v2.length ; i++) {
            resultado[i+v.length]=v2[i];
        }
        return resultado;
    }

}
