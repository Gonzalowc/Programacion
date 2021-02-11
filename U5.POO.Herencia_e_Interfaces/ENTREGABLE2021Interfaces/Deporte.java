package ENTREGABLE2021Interfaces;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Deporte {
    protected String nombre;
    protected String pabellon;
    protected Participante[] participantes;

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.participantes = new Participante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public void addParticipante(Participante jugador){
        participantes = Arrays.copyOf(participantes,participantes.length+1);
        participantes[participantes.length-1] = jugador;
    }
    public void deleteParticipante(String nombre){
        Participante[] aux = new Participante[0];
        for (int i = 0; i < participantes.length; i++) {
            if(!participantes[i].getNombre().equalsIgnoreCase(nombre)){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = participantes[i];
            }
        }
        participantes = aux;
    }
    public void mostrarParticipantes(){
        Arrays.sort(participantes, new Comparator<Participante>() {
            @Override
            public int compare(Participante o1, Participante o2) {
                return o1.edad-o2.edad;
            }
        });
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]+"\n");
        }
    }

    @Override
    public String toString() {
        String participant="";
        for (int i = 0; i < participantes.length; i++) {
            participant+=participantes[i]+"\n";
        }
        return  "Nombre: " + nombre + "\n" +
                "Pabellon: " + pabellon + "\n" +
                "Participantes: "+"\n"+participant;

    }
}
