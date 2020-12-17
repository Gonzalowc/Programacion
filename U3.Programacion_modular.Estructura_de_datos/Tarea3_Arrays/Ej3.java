package T3.Tarea4_Tablas;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ceros=0,numerosPos=0, numerosNeg=0 ;
        double mediaPos=0,mediaNeg=0;
        System.out.println("Cuanto numeros quieres meter?");
        int cant = sc.nextInt();

        int num[] = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce numero: ");
            num[i] = sc.nextInt();
            if(num[i]==0){
                ceros++;
            }
            if(num[i]>=0){
                mediaPos = mediaPos+ num[i];
                numerosPos++;
            }else {
                mediaNeg= mediaNeg + num[i];
                numerosNeg++;
            }
        }
        System.out.println("Cantidad de 0s: "+ceros);
        if(numerosPos>0){
            System.out.println("Media positivos: "+mediaPos/numerosPos);
        }else{
            System.out.println("Media positivos: "+mediaPos);
        }
        if (numerosNeg>0){
            System.out.println("Media negativos: "+mediaNeg/numerosNeg);
        }else{
            System.out.println("Media negativos: "+mediaNeg);

        }


    }
}
