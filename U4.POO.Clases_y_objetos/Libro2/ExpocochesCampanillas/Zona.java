package Libro2.ExpocochesCampanillas;

public class Zona {
    private String nombre;
    private int entradasDisponibles;

    public Zona(String nombre, int capacidad){
        this.nombre = nombre;
        this.entradasDisponibles = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public void venderEntrada(int cantidad){
        if(this.entradasDisponibles==0){
            System.out.println("Lo siento, Las entradas de esta zona están agotadas");
        }else if(this.entradasDisponibles< cantidad){
            System.out.println("Solo me quedan "+ this.entradasDisponibles+" entradas para la zona "+this.nombre);
        }else if(entradasDisponibles-cantidad>=0){
            entradasDisponibles-=cantidad;
            System.out.println("Aqui tiene sus "+ cantidad+" entradas, Gracias");
        }
    }

    @Override
    public String toString() {
        return "_______________________________\n" +
                "Zona: " + nombre + "\n" +
                "Entradas Disponibles: " + entradasDisponibles + "\n";
    }
}
