package Personas;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pepe","Perez", (byte) 18,193.0);
        Persona p2 = new Persona("Ana","franca", (byte) 21,163.0);
        Alumno A = new Alumno("IES. Alixar", new String[]{"Ingles", "Francés","Informática"}, p);
        Alumno B = new Alumno("IES. Alixar", new String[]{"DB", "Francés","Informática"}, p2);

        A.mostrarInfoAlumno();
        B.mostrarInfoAlumno();
    }
}
