package U7_Examen;

public class Main {
    public static void main(String[] args) {
        Instituto i = new Instituto("pepe");

        Alumno a1 = new Alumno("Angela", "Bonilla Gomez","111111A","PROG");
        Alumno a2 = new Alumno("Alicia", "Acosta Ternero","222222B","PROG");
        Alumno a3 = new Alumno("Gonzalo", "Waack Carneado","3333333C","PROG");
        Alumno a4 = new Alumno("Guille", "Rodriguez","4444444D","BBDD");
        Alumno a5 = new Alumno("Fran", "Ferreras","5555555E","BBDD");
        Alumno a6 = new Alumno("Pedro", "Larrubia","6666666F","SI");
        Alumno a7 = new Alumno("óscar", "Casanovas","77777777G","SI");
        Alumno a8 = new Alumno("Dani", "Gonz","8888888888H","4A");
        Alumno a9 = new Alumno("Iñaki", "guti","9999999999I","4A");
        Alumno a0 = new Alumno("Juan Diego", "Perez","00000000J","PROG");
        i.addAlumnoUnidad(a0,a0.getUnidad());
        i.addAlumnoUnidad(a1,a1.getUnidad());
        i.addAlumnoUnidad(a2,a2.getUnidad());
        i.addAlumnoUnidad(a3,a3.getUnidad());
        i.addAlumnoUnidad(a4,a4.getUnidad());
        i.addAlumnoUnidad(a5,a5.getUnidad());
        i.addAlumnoUnidad(a6,a6.getUnidad());
        i.addAlumnoUnidad(a7,a7.getUnidad());
        i.addAlumnoUnidad(a8,a8.getUnidad());
        i.addAlumnoUnidad(a9,a9.getUnidad());
        System.out.println("///////////mostrarTodosAlumnosOrdenados/////APELLIDOS///////");
        i.mostrarTodosAlumnosOrdenados();
        System.out.println("///////////mostrarAlumnosUnidad/////DNI///////");
        i.mostrarAlumnosUnidad("PROG");
        System.out.println("///////////obtenerUnidadAlumno////////////");
        System.out.println("El alumno está en la clase: "+i.obtenerUnidadAlumno("1"));
        System.out.println("///////////GUARDAR DATOS////////////");
        i.guardarAlumnos();
    }
}
