package WaackCarneadoGonzaloE5Examen;

public class Conductor {
    String nombre;
    String apellidos;
    String nss;

    public Conductor(String nombre, String apellidos, String nss) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nss = nss;
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

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "    Conductor: " +"\n"+
                "Nombre: " + nombre + "\n"+
                "Apellidos: " + apellidos + "\n"+
                "NSS: " + nss;
    }
}
