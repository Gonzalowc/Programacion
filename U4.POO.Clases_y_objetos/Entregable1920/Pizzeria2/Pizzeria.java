package Entregable1920.Pizzeria2;

public class Pizzeria {
    Ingredientes I;
    Size s;
    Pedidos p;

    public void carta(){
        System.out.println("Tamaños: ");
        for (Size s : Size.values()) {
            System.out.println(s.name().charAt(0)+s.name().substring(1,s.name().length()-1).toLowerCase());
        }
        System.out.println();
        System.out.println("Ingredientes:");
        for (Ingredientes i: Ingredientes.values()) {
            System.out.printf("%15s | %3d\n",i.name().charAt(0)+i.name().substring(1,i.name().length()-1).toLowerCase(), i.getCalorias());
        }
    }
}
