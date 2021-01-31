package EmpresaTransporte;

public class Destinatario {

    String nombreCompleto;
    String direccion;

    public Destinatario(String nombreCompleto, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre y Apellidos: "+nombreCompleto+"\n"+
                "Dirección: "+direccion;
    }
}
