package Tarea2_Interfaces;

import java.util.*;

public class Ej4_Conjunto{
    public static void main(String[] args) {
        Ej4_Conjunto conjunto = new Ej4_Conjunto(10);
        Ej4_Conjunto conjunto2 = new Ej4_Conjunto();
        System.out.println(conjunto);
        System.out.println(conjunto2);
        conjunto.addNumero(1);
        conjunto.addNumero(2);
        conjunto.addNumero(3);
        conjunto.addNumero(4);
        conjunto.addNumero(5);
        System.out.println(conjunto);
        conjunto2.addNumero(3);
        conjunto2.addNumero(6);
        conjunto2.addNumero(7);
        conjunto2.addNumero(8);
        conjunto2.addNumero(9);
        System.out.println(conjunto2);
        conjunto.addNumeros(conjunto2);
        conjunto.removeElement(6);
        conjunto.removeElements(conjunto2);
        System.out.println(conjunto);
    }


    List<Integer> lista;

    public Ej4_Conjunto(int capacidad) {
        lista = new ArrayList<>(capacidad);
    }
    public Ej4_Conjunto(){
        this(10);
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int nElementos(){
        return lista.size();
    }
    public void addNumeros(Ej4_Conjunto c){
        boolean contiene = false;
        for (int i = 0; i < c.getLista().size(); i++) {
            if(!lista.contains(c.getLista().get(i))){
                addNumero(c.getLista().get(i));
            }
        }
    }
    public void addNumero(Integer num){
        if(!lista.contains(num)){
            lista.add(num);
        }
    }
    public void removeinPosition(int posicion){
        if(posicion>=0 && posicion<lista.size()){
            lista.remove(posicion);
        }
    }
    public void removeElement(Integer valor){
        if(lista.contains(valor)){
            lista.remove(lista.indexOf(valor));
        }
    }
    public void removeElements(Ej4_Conjunto c){
        for (int i = 0; i < c.getLista().size(); i++) {
            if(lista.contains(c.getLista().get(i))){
                removeElement(c.getLista().get(i));
            }
        }
    }
    public boolean isInConjunto(Integer valor){
        return lista.contains(valor);
    }
    public static boolean incluido(Ej4_Conjunto conjunto1, Ej4_Conjunto conjunto2){
        for (int i = 0; i < conjunto1.getLista().size(); i++) {
            if(!conjunto2.getLista().contains(conjunto1.getLista().get(i))){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return "Conjunto: " + lista;
    }
}
