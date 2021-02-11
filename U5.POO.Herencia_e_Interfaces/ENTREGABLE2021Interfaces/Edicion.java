package ENTREGABLE2021Interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Edicion {
    private int anioCeleb;
    private String sede;
    private Pais[] paises;
    private Deporte[] deportes;

    public Edicion(int anioCeleb, String sede) {
        while(anioCeleb%4!=0){
            anioCeleb++;
        }
        this.anioCeleb = anioCeleb;
        this.sede = sede;
        this.paises = new Pais[0];
        this.deportes = new Deporte[0];
    }

    public int getAnioCeleb() {
        return anioCeleb;
    }

    public void setAnioCeleb(int anioCeleb) {
        this.anioCeleb = anioCeleb;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }
    public void addPais(Pais pais){
        paises = Arrays.copyOf(paises,paises.length+1);
        paises[paises.length-1] = pais;
    }
    public void deletePais(String nombrePais){
        Pais[] aux= new Pais[0];
        for (int i = 0; i < paises.length; i++) {
            if(!paises[i].getNombre().equalsIgnoreCase(nombrePais)){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = paises[i];
            }
        }
        paises = aux;
    }
    public void addDeporte(Deporte deporte){
        deportes = Arrays.copyOf(deportes,deportes.length+1);
        deportes[deportes.length-1] = deporte;
    }
    public void deleteDeporte(String nombre){
        Deporte[] aux= new Deporte[0];
        for (int i = 0; i < deportes.length; i++) {
            if(!deportes[i].getNombre().equalsIgnoreCase(nombre)){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = deportes[i];
            }
        }
        deportes = aux;
    }



    public void mostrarPaises(){
        Arrays.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais pais1, Pais pais2) {
                return pais2.getParticipantes()-pais1.getParticipantes();
            }
        });
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }
    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises);
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }

    @Override
    public String toString() {
        String pa = "";
        for (int i = 0; i < paises.length; i++) {
            pa+=paises[i]+"\n";
        }
        String dep = "";
        for (int i = 0; i < deportes.length; i++) {
            dep+=deportes[i]+"\n";
        }
        return "Edición: "+anioCeleb+"\n"+
                "Año de Celebración: " + anioCeleb +"\n"+
                "Sede: " + sede + "\n"+
                "   Paises: \n" + pa +"\n"+
                "   Deportes: \n" + dep;
    }
}
