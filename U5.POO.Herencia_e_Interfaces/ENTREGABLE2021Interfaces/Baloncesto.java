package ENTREGABLE2021Interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Baloncesto extends Deporte {
    int numeroEquipos;
    public Baloncesto(String nombre, String pabellon, int numEquipos) {
        super(nombre, pabellon);
        numeroEquipos = numEquipos;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public void addJugadorBaloncesto(JugadorBaloncesto jugadorBaloncesto){
        addParticipante(jugadorBaloncesto);
    }
    public void deleteJugadorBaloncesto(String nombre){
        deleteParticipante(nombre);
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                super.toString()+"\n"+
                "Numero de Equipos: " + numeroEquipos;
    }

    public void mostrarJugadoresBaloncestoPorAltura(){
        Arrays.sort(participantes, new Comparator<Participante>() {
            @Override
            public int compare(Participante o1, Participante o2) {
                JugadorBaloncesto j1 = (JugadorBaloncesto)o1;
                JugadorBaloncesto j2 = (JugadorBaloncesto)o2;
                return (int)(j1.getAltura()-j2.getAltura());
            }
        });
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]);
        }
    }
}
