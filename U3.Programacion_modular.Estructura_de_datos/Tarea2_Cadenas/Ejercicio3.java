package T3.Tarea2_Cadenas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        String persona="";
        int largo;
        System.out.printf("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.printf("Introduce tu nombre: ");
        apellido = sc.nextLine();

        largo = nombre.length();
        for (int i = 0; i < largo; i++) {
            String sNombre= nombre.substring(i,i+1);
            if(sNombre.equalsIgnoreCase("a") || sNombre.equalsIgnoreCase("e") ||
                    sNombre.equalsIgnoreCase("i") || sNombre.equalsIgnoreCase("o") ||
                    sNombre.equalsIgnoreCase("u") || sNombre.equalsIgnoreCase("Á") ||
                    sNombre.equalsIgnoreCase("É") ||sNombre.equalsIgnoreCase("Í") ||
                    sNombre.equalsIgnoreCase("Ó") ||sNombre.equalsIgnoreCase("Ú")){
        persona=persona;
            }else{
                persona=persona+sNombre;
            }
        }
        largo = apellido.length();
        persona = persona+" ";
        for (int i = 0; i <largo ; i++) {
            String sApellido= apellido.substring(i,i+1);
            if(sApellido.equalsIgnoreCase("a") || sApellido.equalsIgnoreCase("e") ||
                    sApellido.equalsIgnoreCase("i") || sApellido.equalsIgnoreCase("o") ||
                    sApellido.equalsIgnoreCase("u") || sApellido.equalsIgnoreCase("Á") ||
                    sApellido.equalsIgnoreCase("É") ||sApellido.equalsIgnoreCase("Í") ||
                    sApellido.equalsIgnoreCase("Ó") ||sApellido.equalsIgnoreCase("Ú")){
                persona=persona;
            }else{
                persona=persona+sApellido;
            }
        }
        System.out.println(persona);
    }
}
