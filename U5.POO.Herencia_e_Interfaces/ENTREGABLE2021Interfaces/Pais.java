package ENTREGABLE2021Interfaces;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private int participantes;

    public Pais(String nombre, int participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    @Override
    public int compareTo(Pais pais) {
        return this.nombre.compareToIgnoreCase(pais.nombre);
    }

    @Override
    public String toString() {
        return "Pais: " +nombre+"\n"+
                "Participantes: " + participantes;
    }
}
