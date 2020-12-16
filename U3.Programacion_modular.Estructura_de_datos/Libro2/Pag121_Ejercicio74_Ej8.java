package T3.Libro2;

import java.util.Scanner;

public class Pag121_Ejercicio74_Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int[] temperaturas = new int[12];

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Introduce la temperatura media del mes de "+meses[i]);
            temperaturas[i] = sc.nextInt();
        }
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-10s |",meses[i]);
            for (int j = 0; j < temperaturas[i]; j++) {
                if(j==9 || j==19 || j==29){
                    System.out.print("+");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.printf("%10s  %9s|%9s|%9s|\n","","_________","_________","_________");
        System.out.printf("%10s %9s10%8s20%8s30","TEMPERATURA","","","");
    }
}
