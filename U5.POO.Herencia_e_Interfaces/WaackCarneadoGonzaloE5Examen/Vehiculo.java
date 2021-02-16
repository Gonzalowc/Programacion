package WaackCarneadoGonzaloE5Examen;

import java.util.Objects;

public abstract class Vehiculo {
    protected String matricula;
    protected int cargaMax;
    protected Conductor conductor;
    protected double pesoActual;

    public Vehiculo(String matricula, int cargaMax, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        this.conductor = conductor;
        pesoActual=0;
    }

    public Vehiculo(String matricula, int cargaMax) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        conductor = null;
        pesoActual=0;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n"+
                "Carga Maxima: " + cargaMax +"\n"+
                "Conductor: \n" + conductor +"\n"+
                "Peso Actual: " + pesoActual+"kg";
    }
}
