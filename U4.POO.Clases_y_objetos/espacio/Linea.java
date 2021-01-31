package espacio;

public class Linea {
    Punto p1;
    Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos "+p1+" y "+p2;
    }
}
