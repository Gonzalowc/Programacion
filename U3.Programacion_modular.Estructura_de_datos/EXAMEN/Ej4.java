package EXAMEN;

import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {
        String[][] a= {{"HOLA","PERRO","C++"},{"ADIOS","GATO","PYTHON"},{"HASTA LUEGO","VACA","JAVA"}};
        String[][] b= {{"DB","SOBRESALIENTE","PEPE"},{"LM","NOTABLE","MANUEL"},{"PROG","APROBADO","ROSA"}};
        String[][] resultado;

        resultado=unirMatrices(a,b);
        System.out.printf("%115s"," ----------------------------------------------------------------------------------------------------------------- ");
        System.out.println();
        for (int i = 0; i < resultado.length; i++) {
            System.out.print("|");
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.printf(" %15s  |",resultado[i][j]);
            }
            System.out.println();
        }
        System.out.printf("%115s"," ----------------------------------------------------------------------------------------------------------------- ");


    }
    public static String[][] unirMatrices(String[][] a, String[][] b){
        String[][] aux;

        if(a.length == b.length && a[0].length == b[0].length){
            aux = new String[a.length][a[0].length + b[0].length];
            for (int i = 0; i <a.length ; i++) {
                for (int j = 0; j <a[0].length; j++) {

                    aux[i][j]=a[i][j];
                    aux[i][a[0].length+j]=b[i][j];

                }
            }
            return aux;

        }else{
            aux = new String[0][0];
            return aux;
        }

    }
}
