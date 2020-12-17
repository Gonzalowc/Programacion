package T3.Tarea3_Cadenas.PaginaWeb;

import java.util.Scanner;

public class Ej7_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long container[] = new long[10];
        long numero;
        boolean contiene=false;
        for (int i = 0; i < container.length; i++) {
            System.out.print("Introduce el "+(i+1)+"º número: ");
            container[i]= sc.nextLong();
        }
        do {
            System.out.println("¿Qué numero quiere buscar?");
            numero = sc.nextLong();
            contiene=false;
            for (int i = 0; i <container.length; i++) {
                if(container[i]==numero){
                    contiene=true;
                    break;
                }
            }
            if(contiene){
                System.out.println("El número "+numero+" sí está en el array");
            }else{
                System.out.println("El número "+numero+" no está en el array");
            }
        }while(numero!=-1);
    }
}
