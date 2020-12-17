package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un numero: ");
        int n1 = sc.nextInt();
        System.out.printf("Introduce un numero: ");
        int n2 = sc.nextInt();

        System.out.println(numerosAmigos(n1,n2));
    }

    public static boolean numerosAmigos(int n1, int n2) {
        int suma=0;
        for (int i = 1; i <n1 ; i++) {
            if(n1%i==0){
                suma= suma+i;
            }
        }
        if(suma==n2){
            return true;
        }else{
            return false;
        }
    }
}
