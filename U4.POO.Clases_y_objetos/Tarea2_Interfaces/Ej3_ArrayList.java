package Tarea2_Interfaces;

import java.util.*;

public class Ej3_ArrayList {
    public static void main(String[] args) {
        Ej3_ArrayList arr = new Ej3_ArrayList();
        arr.encolar(0);
        arr.encolar(1);
        arr.encolar(2);
        arr.encolar(3);
        arr.encolar(4);
        System.out.println(arr);
        arr.desencolar();
        System.out.println(arr);


    }
    List<Integer> lista;

    public Ej3_ArrayList() {
        this.lista = new ArrayList<>();
    }

    public void encolar(Integer num){
        lista.add(num);
    }
    public Integer desencolar(){
        Integer num = lista.get(0);
        lista.remove(0);
        return num;
    }

    @Override
    public String toString() {
        return "lista: " + lista;
    }
}
