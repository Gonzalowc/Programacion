package IxC19;

import java.io.Serializable;
import java.util.Objects;

public class Paciente implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunas;
    private Medico medico;
    private String cepa;

    public Paciente(String nombre, int edad, double peso, boolean vacunas, Medico medico, String cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medico = medico;
        this.cepa = cepa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getCepa() {
        return cepa;
    }

    public void setCepa(String cepa) {
        this.cepa = cepa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return edad == paciente.edad && nombre.equals(paciente.nombre) && medico.equals(paciente.medico) && cepa.equals(paciente.cepa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, medico, cepa);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                " Nombre: " + nombre + "\n"+
                " Edad: " + edad + "\n"+
                " Peso: " + peso + "\n"+
                " Vacunas: " + (vacunas?"Todas":"Falta alguna") +"\n"+
                medico +"\n"+
                " Cepa: " + cepa;
    }
}
