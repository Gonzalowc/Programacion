package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag122_Ejercicio74_Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {0,1,2,3,4,5,6,7,8};
        cambiarNum(numeros,-1,8);
        System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8]");
        System.out.println(Arrays.toString(numeros));
    }

    public static void cambiarNum(int[] v, int inicial,int fin){
        Scanner sc = new Scanner(System.in);
        int init =0, finit=0;
        do{
            System.out.println("Introduce la posición que desea coger: ");
            inicial=sc.nextInt();
            System.out.println("Introduce la posición a la que desea mover: ");
            fin=sc.nextInt();
        }while(inicial>fin || (inicial<0 || inicial>8) || (fin<0 || fin>8));
        for (int i = 0; i < v.length; i++) {
            if(i<=inicial){
                if(i==0){
                    init=v[i];
                    v[i]=v[v.length-1];
                }else{
                    finit = v[i];
                    v[i]=init;
                    init=finit;
                }
            }else if(i==fin){
                init = v[i];
                v[i] = finit;
                finit = init;
            }else if(i>fin){
                init = v[i];
                v[i]= finit;
                finit=init;
            }
        }

    }
}
