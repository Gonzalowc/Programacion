package CasaBombillas;


public class Main {
    public static void main(String[] args) {
        /*Bombilla b = new Bombilla();
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();
        Bombilla b4 = new Bombilla();
        Bombilla b5= new Bombilla();
        Bombilla b6 = new Bombilla();
        b.estadoBombilla();
        b.interruptor();
        b.estadoBombilla();
        b.interruptor();
        b.estadoBombilla();

        System.out.println("apagar");
        Bombilla.quitarEnergia();
        System.out.println("______");
        b2.interruptor();
        b2.estadoBombilla();
        b4.interruptor();
        b4.estadoBombilla();
        b6.interruptor();
        b6.estadoBombilla();
        System.out.println("Encender");
        Bombilla.ponerEnergia();
        System.out.println("______");
        b2.estadoBombilla();
        b4.estadoBombilla();
        b6.estadoBombilla();*/
        Casa c =  new Casa();

        c.addBombilla();
        c.addBombilla(5);
        c.estadoBombilla();
        c.interruptor(3);
        c.estadoBombilla();
        c.quitarEnergia();
        c.estadoBombilla();
    }
}
