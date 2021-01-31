package Pila;

public class Main {
    public static void main(String[] args) {
        PilaTabla p = new PilaTabla();
        System.out.println(p);
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        System.out.println(p.mostrar());
        /*System.out.println(p);
        Integer num  = p.desApilar();
        while(num!=null){
            System.out.println(num);
            num = p.desApilar();
        }*/

    }
}
