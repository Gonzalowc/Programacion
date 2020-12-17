package T3.Tarea4_Tablas_Adicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Pt2_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del array: ");
        int longitud = sc.nextInt();

        int[] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce numero en el vector: ");
            vector[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(filtraCon7(vector)));
    }

    public  static int[] filtraCon7(int[] v){
        int num,cifra,cont=0;
        boolean contiene7=false;
        int[] aux= new int[0];
        for (int i = 0; i < v.length; i++) {
            num=v[i];
            /*while(num!=0){
                contiene7=false;
                cifra = (int)(num/Math.pow(10, (int)Math.log10(num)));
                num = num-(int)(cifra*Math.pow(10, (int)Math.log10(num)));
                if(cifra==7){
                    contiene7=true;
                    break;
                }
            }*/
            if(contiene7(v[i])){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = v[i];

            }
        }
        if(aux.length==0){
            aux = Arrays.copyOf(aux,aux.length+1);
            aux[0] = -1;
        }


        return aux;
    }

    public static boolean contiene7(int num){
        boolean contiene7=false;
        int cifra;
        while(num!=0){
            contiene7=false;
            cifra = (int)(num/Math.pow(10, (int)Math.log10(num)));
            num = num-(int)(cifra*Math.pow(10, (int)Math.log10(num)));
            if(cifra==7){
                contiene7=true;
                break;
            }
        }
        return contiene7;
    }

}
