package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce un numero");
        int n2 = sc.nextInt();
        System.out.println("Introduce un numero");
        int n3 = sc.nextInt();
        System.out.println("maximo de los 3 numeros: "+maximo3num(n1,n2,n3)+"\ny su suma es: "+sumaNum(n1,n2,n3));
        System.out.println("¿El numero "+n1+" es primo?"+esPrimo(n1));
        System.out.println("¿El numero "+n2+" es primo?"+esPrimo(n2));
        System.out.println("¿El numero "+n3+" es primo?"+esPrimo(n3));
    }
    public static int sumaNum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static int maximo3num(int n1, int n2, int n3) {
        if(n1>n2 && n1>n3){
            return n1;
        }else if (n2>n1 && n2>n3){
            return n2;
        }else{
            return n3;
        }
    }
    public static boolean esPrimo(int num){
        int contador=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                contador++;
            }
        }
        if(contador<=2){
            return true;
        }else{
            return false;
        }
    }
}
