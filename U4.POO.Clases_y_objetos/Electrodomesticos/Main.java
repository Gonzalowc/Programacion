package Electrodomesticos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Lavadora l1 = new Lavadora(10);
        Lavadora l2 = new Lavadora(20);
        Lavadora l3 = new Lavadora(40);
        Lavadora l4 = new Lavadora(50);
        Lavadora l5 = new Lavadora(60);
        Lavadora l6 = new Lavadora(70);
        Televisor t1 = new Televisor(30,false);
        Televisor t2 = new Televisor(80,true);
        Televisor t3 = new Televisor(90,false);
        Televisor t4 = new Televisor(100,true);
        Electrodomestico[] electros = {l1,l2,t1,l3,l4,l5,l6,t2,t3,t4};
        for (int i = 0; i < electros.length; i++) {
            System.out.println(electros[i]);
        }
    }
}
