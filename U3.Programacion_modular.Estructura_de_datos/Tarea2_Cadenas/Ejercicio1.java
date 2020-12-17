package T3.Tarea2_Cadenas;

import java.util.Scanner;
//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
// las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando
// la palabra introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas.
// La cadena "fin" no aparecerá en la frase final.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra, frase="";
        do{
            System.out.printf("Introduce palabras");
            palabra = sc.nextLine().trim();

            if(!palabra.equalsIgnoreCase("fin")){
                if(frase.equals("")){
                    frase = palabra;
                }else{
                    frase = frase+" "+palabra;
                }
            }

        }while(!palabra.equalsIgnoreCase("fin"));

        System.out.println(frase);

    }
}
