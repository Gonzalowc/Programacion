package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag131_Ejercicio74AB_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[4][4];
        int sumaH,sumaV,sumaT=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        int[][] num2 = new int[num.length+1][num[0].length+1];
        for (int i = 0; i < num.length; i++) {
            sumaH=0;
            for (int j = 0; j < num[0].length; j++) {
                sumaH+=num2[i][j] = num[i][j];
            }
            num2[i][num.length]=sumaH;
            sumaT+=sumaH;
            num2[num.length][num[0].length]=sumaT;
        }
        for (int i = 0; i <num.length ; i++) {
            sumaV=0;
            for (int j = 0; j < num[i].length; j++){
                sumaV+=num[j][i];
            }
            num2[num[0].length][i] = sumaV;

        }
       /* for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }*/
        for (int i = 0; i < num2.length; i++) {
            System.out.println(Arrays.toString(num2[i]));
        }
    }
}
