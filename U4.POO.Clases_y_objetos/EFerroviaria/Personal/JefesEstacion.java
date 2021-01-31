package EFerroviaria.Personal;

public class JefesEstacion {
    String nombreCompleto;
    String dni;

    JefesEstacion(String nombre,String DNI){
        this.nombreCompleto = nombre;
        this.dni = DNI;
    }
    public void infoJefeEstacion(){
        System.out.println("Información del Jefe de Estación: ");
        System.out.println("Nombre completo: "+nombreCompleto);
        System.out.println("DNI"+dni);
        System.out.println();
    }
}
