package Tarea2_Interfaces;

import java.util.Arrays;

public class Ej2_ColaTabla extends Ej1_ArrayAl{
    public static void main(String[] args) {
        Ej2_ColaTabla cola = new Ej2_ColaTabla();
        cola.encolar(0);
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        cola.encolar(4);
        System.out.println(cola);
        cola.desencolar();
        System.out.println(cola);


    }

    public void encolar(Integer numero){
        tabla = Arrays.copyOf(tabla,tabla.length+1);
        tabla[tabla.length-1] = numero;
    }
    public Integer desencolar(){
        Integer num = tabla[0];
        Integer[] aux = new Integer[0];
        for (int i = 1; i < tabla.length; i++) {
            aux = Arrays.copyOf(aux,aux.length+1);
            aux[aux.length-1] = tabla[i];
        }
        tabla = aux;
        return num;
    }

    @Override
    public String toString() {
        return "tabla: " + Arrays.toString(tabla);
    }
}
