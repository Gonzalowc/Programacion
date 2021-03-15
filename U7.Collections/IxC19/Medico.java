package IxC19;

import java.io.Serializable;
import java.util.Objects;

public class Medico implements Serializable {
    private String nombre;
    private String apellidos;
    private String numColegiado;
    private String hospital;

    public Medico(String nombre, String apellidos, String numColegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numColegiado = numColegiado;
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico)) return false;
        Medico medico = (Medico) o;
        return numColegiado.equals(medico.numColegiado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numColegiado);
    }

    @Override
    public String toString() {
        return "Medico: \n" +
                " Nombre: " + nombre + "\n"+
                " Apellidos: " + apellidos + "\n"+
                " Numero de Colegiado: " + numColegiado + "\n"+
                " Hospital: " + hospital;
    }
}
