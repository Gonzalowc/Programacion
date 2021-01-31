package Lista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       PilaLista pi = new PilaLista(10);
       pi.apilar(1);
       pi.apilar(2);
       pi.apilar(3);
       pi.apilar(4);
       pi.apilar(5);
       System.out.println(pi);
       pi.ordenInverso();

    }
}
