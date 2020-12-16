package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class segundaPag_Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double note,media=0,max=0,min=0;
        for (int i = 0; i < notas.length; i++) {
            do{
                System.out.println("Introduce nota "+(i+1)+": ");
                note = sc.nextDouble();
            }while(note<0 || note>10);
            notas[i] = note;
            media+=notas[i];
            if(i==0){
                min=notas[i];
                max=notas[i];
            }else{
                if(max<notas[i]){
                    max = notas[i];
                }
                if(min>notas[i]) {
                    min=notas[i];
                }
            }
        }
        System.out.println("Notas: "+ Arrays.toString(notas));
        System.out.println("Nota máxima: "+max);
        System.out.println("Nota mínima: "+min);
        System.out.printf("Nota media : %-6.2f",media/notas.length);
    }
}
