package T3.Tarea4_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7_bidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media1 =0,media2=0,media3=0, notas=0, notas1=0,notas2=0,notas3=0;
        int[][] nota = new int[5][3];
        for (int i = 0; i < nota.length; i++) {
            for (int j = 0; j <nota[i].length ; j++) {
                System.out.println("Introduce la nota del alumno nº"+(i+1)+" del trimestre "+(j+1));
                if(j==0){
                    media1 += nota[i][j] = sc.nextInt();
                }else if(j==1){
                    media2+= nota[i][j] = sc.nextInt();
                }else{
                    media3+=nota[i][j] = sc.nextInt();
                }
            }
        }
        notas1 = (media1/nota.length);
        notas2 = media2/nota.length;
        notas3 = media3/nota.length;
        System.out.printf("%-24s | %-15s | %-17s  | %-17s  | %-17s\n","Mensaje","Nota Individual", "Trimestre 1 Grupo", "Trimestre 2 Grupo", "Trimestre 3 Grupo");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < nota.length; i++) {
            notas=0;
            for (int j = 0; j < nota[0].length; j++) {
                notas += nota[i][j];
            }
            notas = notas/3;
            if(i == nota.length/2) {
                System.out.printf("%-24s |\t %4.2f\t\t   |\t %4.2f\t\t\t|\t %4.2f\t\t\t |\t %4.2f\n", "Notas medias alumno nº" + (i + 1) + ":", notas, notas1, notas2, notas3);
            }else{
                System.out.printf("%-24s |\t %4.2f\t\t   | %-19s| %-19s| %-19s\n", "Notas medias alumno nº" + (i + 1) + ":", notas,"" ,"" , "");
            }
        }
    }
}
