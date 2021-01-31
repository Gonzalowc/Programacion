package EFerroviaria.Personal;

public class Mecanicos {
    String nombreCompleto;
    String telefono;
    String Especialidad;

    public Mecanicos(String nombreCompleto, String telefono, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.Especialidad = especialidad;
    }
    public void infoMecanico(){
        System.out.println("Información del mecánico: ");
        System.out.println("Nombre completo: "+nombreCompleto);
        System.out.println("Telefono: "+telefono);
        System.out.println("Especialidad: "+Especialidad);
        System.out.println();
    }
}
