package T3.Tarea4_Tablas;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static int factorial(int num){
        int resultado;
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
}
