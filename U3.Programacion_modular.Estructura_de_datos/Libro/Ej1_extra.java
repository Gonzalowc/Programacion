package T3.Libro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//borrar vocales
public class Ej1_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sinVocal = new String[0];
        System.out.println("Introduce palabra");
        String palabra = sc.nextLine();
        String sinvoc;
        String[] letras = palabra.split("",palabra.length());

        for (int i = 0; i < letras.length; i++) {
            if(!letras[i].equals("a") && !letras[i].equals("e")
                    && !letras[i].equals("i") &&!letras[i].equals("o")
                    &&!letras[i].equals("u")){

                sinVocal = Arrays.copyOf(sinVocal,sinVocal.length+1);
                sinVocal[sinVocal.length-1]= letras[i];
            }
        }
        sinvoc= String.join("",sinVocal);
        System.out.println(sinvoc);
    }
}
