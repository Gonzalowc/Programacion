package WaackCarneadoGonzaloE5Examen;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo implements Comparable<CamionPerchas>{
    PrendaColgada[] prendasColgadas;

    public CamionPerchas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.prendasColgadas = new PrendaColgada[0];
    }

    public CamionPerchas(String matricula, int cargaMax) {
        super(matricula, cargaMax);
        this.prendasColgadas = new PrendaColgada[0];
    }



    public PrendaColgada[] getPrendasColgadas() {
        return prendasColgadas;
    }

    public void setPrendasColgadas(PrendaColgada[] prendasColgadas) {
        this.prendasColgadas = prendasColgadas;
    }

    @Override
    public void descargar() {
        int cantPrendas=prendasColgadas.length;
        System.out.println("Descargando "+cantPrendas+" prendas");
        prendasColgadas = Arrays.copyOf(prendasColgadas, 0);
        pesoActual =0;
    }

    public void addPrendaColgada(PrendaColgada prendaColgada){
        if(prendaColgada.getPeso()+pesoActual<=cargaMax){
            prendasColgadas = Arrays.copyOf(prendasColgadas,prendasColgadas.length+1);
            prendasColgadas[prendasColgadas.length-1] = prendaColgada;
            pesoActual+=prendaColgada.getPeso();
        }else{
            System.out.println("El camión no puede llevar más peso");
        }

    }
    public void deletePrendaColgada(PrendaColgada prendaColgada){
        PrendaColgada[] aux = new PrendaColgada[0];
        for (int i = 0; i < prendasColgadas.length; i++) {
            if(!prendaColgada.equals(prendasColgadas[i])){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = prendasColgadas[i];
                pesoActual-= prendasColgadas[i].getPeso();
            }
        }
        prendasColgadas = aux;
    }
    public void deletePrendaColgada(String codigoBarras){
        PrendaColgada[] aux = new PrendaColgada[0];
        for (int i = 0; i < prendasColgadas.length; i++) {
            if(codigoBarras.equals(prendasColgadas[i].getCodigoBarras()) ){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = prendasColgadas[i];
                pesoActual-= prendasColgadas[i].getPeso();
            }
        }
        prendasColgadas = aux;
    }

    @Override
    public int compareTo(CamionPerchas o) {
        return this.prendasColgadas.length-o.prendasColgadas.length;
    }
    @Override
    public String toString() {
        String contenido="";
        for (int i = 0; i < prendasColgadas.length; i++) {
            contenido+=prendasColgadas[i].toString()+"\n";
        }
        return "Camion Perchas: \n" +
                super.toString()+"\n"+
                "Cantidad de Prendas Colgadas: " + prendasColgadas.length+"\n"+
                "Prendas Colgadas: "+"\n"+
                contenido;
    }
}
