package T3.Tarea2_Cadenas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena, letra;
        int espacios=0;
        System.out.printf("Introduce una frase: ");
        cadena = sc.nextLine().trim();

        for (int i = 0; i <cadena.length()-1 ; i++) {
            letra = cadena.substring(i,i+1);
            if(letra.equals(" ")){
                espacios++;
            }
        }
        System.out.println("La frase '"+cadena+"' tiene "+espacios+" espacios");
    }
}
