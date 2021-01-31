package Frontera;

public class Persona {
    private String dni;
    private String nombreCompleto;

    public Persona(String dni, String nombreCompleto) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
