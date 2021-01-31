package Pila;

import java.util.Arrays;

public class PilaTabla {
    private int indiceCima;
    private Integer[] tabla;

    public PilaTabla() {
        indiceCima=-1;
        tabla = new Integer[10];
    }

    public PilaTabla(int capacidadInicial) {
        tabla = new Integer[capacidadInicial];
    }
    private boolean pilaVacia(){
        return indiceCima == -1;
    }
    private boolean pilaLlena(){
        return indiceCima == tabla.length-1;
    }
    Integer cima(){
        Integer elementoCima= null;
        if(!pilaVacia()){
            elementoCima = tabla[indiceCima];
        }
        return elementoCima;
    }
    void apilar(Integer elemento){
        if(pilaLlena()){
            tabla = Arrays.copyOf(tabla,tabla.length+10);
        }
        indiceCima++;
        tabla[indiceCima] = elemento;
    }
    Integer desApilar(){
        Integer elemento = null;
        if(!pilaVacia()){
            elemento = tabla[indiceCima];
            indiceCima--;
        }
        return elemento;
    }
    public String mostrar(){
        String resultado = "";
        for (int i = 0; i <=indiceCima; i++) {
            resultado+=tabla[i]+" ";
        }
        resultado+="(cima)";
        return resultado;
    }

    @Override
    public String toString() {
        return "PilaTabla{\n" +

                "tabla=" + Arrays.toString(tabla) +
                "\n}";
    }
}
