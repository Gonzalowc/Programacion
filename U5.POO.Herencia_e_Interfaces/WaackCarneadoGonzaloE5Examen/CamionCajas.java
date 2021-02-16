package WaackCarneadoGonzaloE5Examen;

import java.util.Arrays;
import java.util.Comparator;

public class CamionCajas extends Vehiculo implements Comparable<CamionCajas>{
    private Caja[] cajas;

    public CamionCajas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.cajas = new Caja[0];
    }

    public CamionCajas(String matricula, int cargaMax) {
        super(matricula, cargaMax);
        this.cajas = new Caja[0];
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }
    public void addCaja(Caja caja){
        if(caja.getPesoCaja()+pesoActual<=cargaMax){
            cajas = Arrays.copyOf(cajas,cajas.length+1);
            cajas[cajas.length-1] = caja;
            cargaMax+=caja.getPesoCaja();
        }else{
            System.out.println("El camión no puede llevar más peso");
        }

    }
    public void deleteCaja(Caja caja){
        Caja[] aux = new Caja[0];
        for (int i = 0; i < cajas.length; i++) {
            if(!caja.equals(cajas[i])){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = cajas[i];
                pesoActual-=cajas[i].getPesoCaja();
            }
        }
        cajas = aux;
    }
    public void deleteCaja(int idCaja){
        Caja[] aux = new Caja[0];
        for (int i = 0; i < cajas.length; i++) {
            if(idCaja !=cajas[i].getIdCaja()){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = cajas[i];
                pesoActual-=cajas[i].getPesoCaja();
            }
        }
        cajas = aux;
    }
    private int cantidadPrendas(){
    int cantPrendas=0;
    for (int i = 0; i < cajas.length; i++) {
        cantPrendas+=cajas[i].getPrendas().length;
    }
    return cantPrendas;
}
    @Override
    public void descargar() {
        int cantPrendas=0;
        int cantCajas=cajas.length;

        System.out.println("Descargando "+cantCajas+" cajas y "+cantidadPrendas()+" prendas");
        cajas = Arrays.copyOf(cajas,0);
        pesoActual=0;
    }

    @Override
    public String toString() {
        String contenido="";
        for (int i = 0; i < cajas.length; i++) {
            contenido+=cajas[i].toString()+"\n";
        }
        return "Camion Cajas: \n" +
                super.toString()+"\n"+
                "Cantidad de cajas: " + cajas.length+"\n"+
                "Cantidad de prendas: "+cantidadPrendas()+ "\n"+
                "Contenido de las cajas:\n "+ contenido;
    }

    @Override
    public int compareTo(CamionCajas o) {
        return this.cajas.length-o.cajas.length;
    }

    public static class ordenarCamionCajaXPeso implements Comparator<CamionCajas>{
        @Override
        public int compare(CamionCajas o1, CamionCajas o2) {
            return (int)(o1.getPesoActual()-o2.getPesoActual());
        }
    }
}
