package EFerroviaria.Maquinaria;

import EFerroviaria.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    Locomotora L;
    int maxVagones;
    Vagones[] V = new Vagones[0];
    Maquinista M;

    public Tren(Locomotora loco, Maquinista maquinis, int maxVa) {
        L = loco;
        M = maquinis;
        this.maxVagones = maxVa;
    }

    public void unirVagones(int cargaMax, int cargaActual, String tipoMercancia){
        if(V.length<maxVagones){
            V = Arrays.copyOf(V, V.length+1);
            Vagones vagones = new Vagones(cargaMax,cargaActual,tipoMercancia);
            V[V.length-1] =vagones;
        }else{
            System.out.println("Maxima de vagones alcanzado");
        }

    }
    public void estadoTren(){
        System.out.println("Estado del tren: ");
        System.out.println("Informacion de la locomotora: ");
        L.infoLoco();
        System.out.println("Informacion de los vagones: ");
        System.out.println("Cantidad máxima de vagones: "+maxVagones);
        System.out.println("Cantidad de vagones: "+V.length);
        for (int i = 0; i < V.length; i++) {
            System.out.println("Vagon "+(i+1)+":");
            System.out.println("Tipo de Mercancía: "+V[i].tipoMercancia);
            System.out.println("Carga Máxima: "+V[i].cargaMax);
            System.out.println("Carga Actual: "+V[i].cargaActual);
        }
        System.out.println("");
        M.inforMaquinista();

    }
}
