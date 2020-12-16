package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class segundaPag_Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[0];
        int[] edades = new int[0];
        String[] mayores = new String[0];
        String[] LosMasMayores = new String[3];
        int[] EdadLosMasMayores = new int[3];
        int MayorEdad, anterior=0,posterior=0;
        String anteriorNom="",posteriorNom="";
        String nombre;
        int edad;
        do{
            System.out.println("Introduce Nuevo nombre: ");
            nombre = sc.nextLine();
            if(!nombre.equals("*")){
                nombres = Arrays.copyOf(nombres, nombres.length+1);
                nombres[nombres.length-1] = nombre;
                do{
                    System.out.println("Introduce la edad de "+ nombre);
                    edad = sc.nextInt();
                    sc.nextLine();
                    if(edad>=18){
                        mayores = Arrays.copyOf(mayores, mayores.length+1);
                        mayores[mayores.length-1] = nombres[nombres.length-1];
                        for (int i = 0; i < LosMasMayores.length; i++) {
                            if(EdadLosMasMayores[i] < edad){
                                for (int j = i; j <EdadLosMasMayores.length ; j++) {
                                    if(j==i){
                                        anterior=EdadLosMasMayores[j];
                                        EdadLosMasMayores[j] = edad;
                                        anteriorNom = LosMasMayores[j];
                                        LosMasMayores[j] = nombre;
                                    }else{
                                        posterior = EdadLosMasMayores[j];
                                        EdadLosMasMayores[j]= anterior;
                                        anterior=posterior;
                                        posteriorNom = LosMasMayores[j];
                                        LosMasMayores[j] = anteriorNom;
                                        anteriorNom = posteriorNom;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }while(edad<0);

                edades = Arrays.copyOf(edades,edades.length+1);
                edades[edades.length-1] = edad;
            }
        }while(!nombre.equals("*"));
        System.out.println("Todos los alumnos: "+Arrays.deepToString(nombres));
        System.out.println("Edades de alumnos: "+Arrays.toString(edades));
        System.out.println("Los alumnos Mayores de edad: "+Arrays.toString(mayores));
        System.out.println("Los más mayores  : "+Arrays.toString(LosMasMayores));
        System.out.println("Los mayres edades: "+Arrays.toString(EdadLosMasMayores));
    }
}
