package ENTREGABLE2021Interfaces;

import java.util.Arrays;

public class CDI {
    private Edicion[] ediciones;

    public CDI() {
        ediciones = new Edicion[0];
    }
    public void addEdicion(Edicion edicion){
        ediciones = Arrays.copyOf(ediciones,ediciones.length+1);
        ediciones[ediciones.length-1] = edicion;
    }
    public void deleteEdicion(int anioEdicion){
        Edicion[] aux = new Edicion[0];
        for (int i = 0; i < ediciones.length; i++) {
            if(ediciones[i].getAnioCeleb()!=anioEdicion){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = ediciones[i];
            }
        }
        ediciones = aux;
    }

    @Override
    public String toString() {
        String edicioness ="";
        for (int i = 0; i < ediciones.length; i++) {
            edicioness+=ediciones[i]+"\n";
        }
        return "CDI :\n" +
                "   Ediciones: \n" + edicioness;
    }
}
