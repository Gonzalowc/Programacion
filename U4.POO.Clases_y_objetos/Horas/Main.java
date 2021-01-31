package Horas;

public class Main {
    public static void main(String[] args) {
        /*Hora h1 = new Hora(20, 65);
        Hora h2 = new Hora(22, 59);*/
        Hora12 h2 = new Hora12(12,59,ParteHoraria.PM);
        Hora12 h3 = new Hora12(12,59,ParteHoraria.PM);
        HoraExacta h4 = new HoraExacta(23,59,30);
        HoraExacta h5 = new HoraExacta(23,59,30);
        /*System.out.println(h1);
        System.out.println(h2);
        h2.inc();
        System.out.println(h2);*/
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h4.equals(h5) ? "Son iguales": "No lo son");
        System.out.println(h3.equals(h2) ? "Son iguales": "No lo son");
       /* for (int i = 0; i < 60; i++) {
            h3.inc();
            System.out.println(h3);
        }*/


    }
}
