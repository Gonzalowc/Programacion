package Calendario;

public class Main {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(2020,12,20);
        Calendario c2 = new Calendario(2020,12,20);
        c1.incrementarMes(3);c1.mostrar();

        c2.incrementarDia(90);c2.mostrar();


        c1.iguales(c2);
    }
}
