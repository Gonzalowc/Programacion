package espacio;

public class Punto {
    public static void main(String[] args) {
        Punto p1 = new Punto(4.21, 7.3);
        Punto p2 = new Punto(2.21, 5.3);
        Linea l1 = new Linea(p1,p2);
        System.out.println(l1);
    }
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
