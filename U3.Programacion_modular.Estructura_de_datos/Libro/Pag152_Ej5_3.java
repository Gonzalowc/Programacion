package T3.Libro;
import java.util.Arrays;
import java.util.Scanner;

public class Pag152_Ej5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posI=-1, posF=0, posAUX=0;
        String camino;
        System.out.println("Introduce el area del mapa");
        int area = sc.nextInt();
        boolean[][] mapa = new boolean[area][area];
        while(posF>=0 && posF<area){
            if(posI==-1){
                System.out.println("Introduce la posición inicial: ");
                posI = sc.nextInt();
            }else {
                posI = posAUX;
            }
            System.out.println("La posición tiene varios caminos?(s/n): ");
            sc.nextLine();
            camino = sc.nextLine();
            if(camino.equals("s")){
                System.out.println("Introduce la posición inicial: ");
                posI = sc.nextInt();
            }
            System.out.println("Introduce la posición final: ");
            posF = sc.nextInt();
            posAUX=posF;
            if(posF>=0 && posF<area){
                mapa[posI][posF]=true;
            }
        }
        for (int i = 0; i < area; i++) {
            System.out.println(Arrays.toString(mapa[i]));
        }
    }
}
