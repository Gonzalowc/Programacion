package Entregable1920.Pizzeria2;

public class Main {
    public static void main(String[] args) {
        Pizzeria p = new Pizzeria();
         p.carta();
         Pizzas p1 = new Pizzas(Size.MEDIANA,Ingredientes.ATUN,Ingredientes.BACON,Ingredientes.JAMON_YORK);
         Pedidos ped = new Pedidos();
         ped.nuevoPedido(p1);
         Pizzas p2 = new Pizzas();
         ped.nuevoPedido(p2);
         Pizzas p3 = new Pizzas(Favoritas.BARBACOA_FAMILIAR);
         ped.nuevoPedido(p3);
         ped.reporteDia();
         p2.addIngrediente(Ingredientes.ALBAHACA);
        ped.reporteDia();
    }

}
