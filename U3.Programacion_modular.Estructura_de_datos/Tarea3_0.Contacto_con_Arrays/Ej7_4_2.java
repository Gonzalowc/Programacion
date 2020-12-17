package T3.Tarea3_Cadenas.PaginaWeb;

import java.util.Scanner;

public class Ej7_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numeros[] = new double[8];
        double min=0,max=0;

        for (int i = 0; i <numeros.length ; i++) {
            System.out.printf("Introduce el"+(i+1)+"º número: ");
            numeros[i]=sc.nextDouble();
            if(i==0){
                min=numeros[i];
                max=numeros[i];
            }else{
                if(numeros[i]>max){
                    max = numeros[i];
                }
                if(numeros[i]<min){
                    min = numeros[i];
                }
            }
        }
        System.out.println("El mínimo es: "+min);
        System.out.println("El maximo es: "+max);


    }
}
