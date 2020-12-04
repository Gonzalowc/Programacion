package entregable2021;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce el número");
            num = sc.nextInt();
        }while(num<0);
        System.out.println(convierteEnMorse(num));
    }

    public static String convierteEnMorse(int n){
        String[] numMorse = {". _ _ _ _",". . _ _ _",". . . _ _",". . . . _",". . . . .",
                "_ . . . .","_ _ . . .","_ _ _ . .","_ _ _ _ .","_ _ _ _ _"};
        String[] numInt;
        String numCad="";
        numCad = ""+n;
        numInt= numCad.split("",numCad.length());
        numCad="";
        for (int i = 0; i < numInt.length; i++) {

            numCad+=numMorse[Integer.parseInt(numInt[i])-1]+" ";
        }
        return numCad;
    }
}
