package U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable,Comparable<Alumno> {
    private String nombre;
    private String apellidos;
    private String dni;
    private String id;
    private static int genID=0;
    private String unidad;

    public Alumno(String nombre, String apellidos, String dni, String unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = Integer.toString(genID);
        genID++;
        this.unidad = unidad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getGenID() {
        return genID;
    }

    public static void setGenID(int genID) {
        Alumno.genID = genID;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return id.equals(alumno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"+
                "Apellidos: " + apellidos + "\n"+
                "DNI: " + dni + "\n"+
                "ID: " + id + "\n"+
                "Unidad: " + unidad;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.dni.compareToIgnoreCase(o.dni);
    }
}
