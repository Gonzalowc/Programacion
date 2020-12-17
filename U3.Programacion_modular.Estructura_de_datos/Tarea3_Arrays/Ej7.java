package T3.Tarea4_Tablas;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] trimestre1 = new int[5];
        int[] trimestre2 = new int[5];
        int[] trimestre3 = new int[5];
        double media1 =0,media2=0,media3=0, notas, notas1,notas2,notas3;
        for (int i = 0; i < trimestre1.length; i++) {
            System.out.printf("Introduce la nota del alumno nº "+(i+1)+" del trimestre 1: ");
            media1 += trimestre1[i] = sc.nextInt();
            System.out.printf("Introduce la nota del alumno nº "+(i+1)+" del trimestre 2: ");
            media2 += trimestre2[i] = sc.nextInt();
            System.out.printf("Introduce la nota del alumno nº "+(i+1)+" del trimestre 3: ");
            media3 += trimestre3[i] = sc.nextInt();
        }
        System.out.printf("%-24s | %-15s | %-17s  | %-17s  | %-17s\n","Mensaje","Nota Individual", "Trimestre 1 Grupo", "Trimestre 2 Grupo", "Trimestre 3 Grupo");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < trimestre1.length; i++){
            notas = (double) (trimestre1[i]+trimestre2[i]+trimestre3[i])/3;
            notas1 = media1/trimestre1.length;
            notas2 = media2/trimestre2.length;
            notas3 = media3/trimestre3.length;
            System.out.printf("%-24s |\t %4.2f\t\t   |\t %4.2f\t\t\t|\t %4.2f\t\t\t |\t %4.2f\n","Notas medias alumno nº"+(i+1)+":",notas, notas1,notas2,notas3);
        }
    }
}
