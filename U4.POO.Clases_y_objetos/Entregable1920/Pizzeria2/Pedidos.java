package Entregable1920.Pizzeria2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Pedidos {

    Pizzas[] pizzas;
    String[] date;

    public Pedidos() {
        pizzas = new Pizzas[0];
        date = new String[0];
    }

    public void nuevoPedido( Pizzas p){
        pizzas = Arrays.copyOf(pizzas, pizzas.length+1);
        pizzas[pizzas.length-1] = p;
        date = Arrays.copyOf(date, date.length+1);
        date[date.length-1] = fecha();
    }

    public int cantidadDePedidos(){
        int cantidad;
        return cantidad=pizzas.length;
    }

    public void reporteDia(){
        System.out.println("Cantidad de pedidos: "+cantidadDePedidos());
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Pedido nº"+(i+1)+":  fecha: "+date[i]);
            pizzas[i].infoPizza();
        }
    }
    public static String fecha(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);
        Date date = cal.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date1 = format1.format(date);
        return date1;
    }
}