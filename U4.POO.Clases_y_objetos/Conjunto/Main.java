package Conjunto;

public class Main {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto();
        for (int i = 0; i < 10; i++) {
            c1.insertarPrincipio(i);
            c2.insertarPrincipio(10+i);
        }
        c1.insertarotroConjunto(c2);
        //System.out.println(c1.numeroElemento());
        System.out.println(c1);
        System.out.println(c2);
    }
}
