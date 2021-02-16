package WaackCarneadoGonzaloE5Examen;

import java.util.Arrays;

public class FARA {
    CamionPerchas[] camionPerchas;
    CamionCajas[] camionCajas;

    public FARA() {
        this.camionPerchas = new CamionPerchas[0];
        this.camionCajas = new CamionCajas[0];
    }

    public CamionPerchas[] getCamionPerchas() {
        return camionPerchas;
    }

    public void setCamionPerchas(CamionPerchas[] camionPerchas) {
        this.camionPerchas = camionPerchas;
    }

    public CamionCajas[] getCamionCajas() {
        return camionCajas;
    }

    public void setCamionCajas(CamionCajas[] camionCajas) {
        this.camionCajas = camionCajas;
    }

    public void addVehiculo(Vehiculo vehiculo){
        if(vehiculo instanceof CamionCajas){
            camionCajas = Arrays.copyOf(camionCajas,camionCajas.length+1);
            camionCajas[camionCajas.length-1] = (CamionCajas) vehiculo;
        }else{
            camionPerchas = Arrays.copyOf(camionPerchas,camionPerchas.length+1);
            camionPerchas[camionPerchas.length-1] = (CamionPerchas) vehiculo;
        }

    }
    public void deleteVehiculo(Vehiculo vehiculo){
        if(vehiculo instanceof CamionCajas){
            CamionPerchas[] aux = new CamionPerchas[0];
            for (int i = 0; i < camionPerchas.length; i++) {
                if(!vehiculo.equals(camionPerchas[i])){
                    aux = Arrays.copyOf(aux,aux.length+1);
                    aux[aux.length-1] = camionPerchas[i];
                }
            }
            camionPerchas = aux;
        }else{
            CamionCajas[] aux = new CamionCajas[0];
            for (int i = 0; i < camionCajas.length; i++) {
                if(!vehiculo.equals(camionPerchas[i])){
                    aux = Arrays.copyOf(aux,aux.length+1);
                    aux[aux.length-1] = camionCajas[i];
                }
            }
            camionCajas = aux;
        }
    }
    public void mostrarCamionPerchas(){
        for (int i = 0; i < camionPerchas.length; i++) {
            System.out.println(camionPerchas[i]);
        }
    }
    public void mostrarCamionCajas(){
        for (int i = 0; i < camionCajas.length; i++) {
            System.out.println(camionCajas[i]);
        }
    }
    @Override
    public String toString() {
        String cp ="";
        for (int i = 0; i < camionPerchas.length; i++) {
            cp += camionPerchas[i]+"\n";
        }
        String cc ="";
        for (int i = 0; i < camionCajas.length; i++) {
            cc += camionCajas[i]+"\n";
        }
        return "    EMPRESA FARA" +"\n"+
                "camiones de Perchas: \n"
                + cp +
                "\ncamionCajas: \n" +
                cc;
    }
}
