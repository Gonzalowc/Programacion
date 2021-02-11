package ENTREGABLE2021Interfaces;

import java.util.Objects;

public class Atleta extends Participante implements Correr {
    private String nombrePrueba;

    public Atleta(String nombre, int edad, String nombrePrueba) {
        super(nombre, edad);
        this.nombrePrueba = nombrePrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+nombre+", como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public void correr() {
        System.out.println("Voy a correr");
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                super.toString()+"\n"+
                "nombrePrueba: " + nombrePrueba;
    }
}
