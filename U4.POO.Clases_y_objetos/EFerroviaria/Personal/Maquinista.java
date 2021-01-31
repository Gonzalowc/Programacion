package EFerroviaria.Personal;

public class Maquinista {
    String nombreCompleto;
    String dni;
    int sueldoMensual;
    String rango;

    public Maquinista(String nombreCompleto, String dni, int sueldoMensual, String rango) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldoMensual = sueldoMensual;
        this.rango = rango;
    }
    public void inforMaquinista(){
        System.out.println("Información del maquinista: ");
        System.out.println("Nombre completo: "+nombreCompleto);
        System.out.println("DNI: "+dni);
        System.out.println("Sueldo Mensual: "+sueldoMensual);
        System.out.println("Rango: "+rango);
        System.out.println();
    }
}
