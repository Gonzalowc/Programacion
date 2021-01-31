package Texto;

import java.util.Arrays;

public class Texto {

    char[] cadena;
    int longitudMax;

    Texto(int longitud){
        this.longitudMax = longitud;
        this.cadena = new char[0];
    }

    public void insertarFinal(char c){
        if(cadena.length<longitudMax){
            this.cadena = Arrays.copyOf(cadena, cadena.length+1);
            cadena[cadena.length-1] = c;
        }else{
            System.out.println("Cadena completa");
        }
    }
    public void insertarPrincipio(char c){

        char ant=' ',post=' ';
        if(cadena.length<longitudMax){
            this.cadena = Arrays.copyOf(cadena, cadena.length+1);
            for (int i = 0; i < cadena.length; i++) {
                if(i==0){
                    ant = cadena[i];
                    cadena[i]= c;
                }else{
                    post = cadena[i];
                    cadena[i] = ant;
                    ant = post;
                }
            }
        }else{
            System.out.println("Cadena completa");
        }
    }
    public void insertarFinalCadena(String cad){
        if(cad.length()+cadena.length<=longitudMax){
            for (int i = 0; i < cad.length(); i++) {
                this.cadena = Arrays.copyOf(cadena, cadena.length+1);
                cadena[cadena.length-1] = cad.charAt(i);
            }
        }else{
            System.out.println("Cadena completa");
        }
    }
    public void insertarPrincioCadena(String cad){
        if(cad.length()+cadena.length<=longitudMax){
            char t;
            char ant=' ',post;
            for (int i = cad.length()-1; i >=0 ; i--) {
                this.cadena = Arrays.copyOf(cadena, cadena.length+1);
                t = cad.charAt(i);
                for (int j = 0; j < cadena.length; j++) {
                    if(j==0){
                        ant = cadena[j];
                        cadena[j]= t;
                    }else{
                        post = cadena[j];
                        cadena[j] = ant;
                        ant = post;
                    }
                }
            }
        }else{
            System.out.println("Cadena completa");
        }
    }
    public void mostrarCadena(){
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i]);
        }
        System.out.println();
    }
    public int CantidadVocales(){ //cadena[i].equalsIgnoreCase("a") ||
        int cantVocales=0;
        for (int i = 0; i < cadena.length; i++) {
            if(cadena[i]=='a' || cadena[i]=='e' || cadena[i]=='i' || cadena[i]=='o' || cadena[i]=='u' ||
                    cadena[i]=='A' || cadena[i]=='E' || cadena[i]=='I' || cadena[i]=='O' || cadena[i]=='U'){
                cantVocales++;
            }
        }
        return cantVocales;
    }



}
