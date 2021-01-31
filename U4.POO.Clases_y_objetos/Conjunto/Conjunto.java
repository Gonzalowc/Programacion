package Conjunto;

import Lista.Lista;

public class Conjunto {

    Lista lista;

    public Conjunto() {
        this.lista = new Lista();
    }

    public Conjunto(int longitud) {
        this.lista = new Lista(longitud);
    }
    int numeroElemento(){
        return lista.elementosInsertados();
    }
    public boolean contiene(int num){
        if(lista.indiceNumero(num)>=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean insertarFinal(int numero){
        if(contiene(numero)){
            return false;
        }else{
            lista.insertarFinal(numero);
            return true;
        }
    }
    public boolean insertarPrincipio(int numero){
        if(contiene(numero)){
            return false;
        }else{
            lista.insertarPrincipio(numero);
            return true;
        }
    }
    public void insertarotroConjunto(Conjunto con){
        Integer[] list = con.lista.getTabla();
            for (int j = 0; j < this.lista.getLongTabla(); j++) {
                if(j<list.length && list[j]!=null){
                    if(insertarFinal(list[j])){
                        insertarFinal(list[j]);
                    }
                }
            }
        //lista.insertarOtraLista(con.lista);
    }

    public boolean incluido(Conjunto c1, Conjunto c2){

        if(c2.numeroElemento() >= c1.numeroElemento()){
            for (int i = 0; i < c1.numeroElemento(); i++) {
                if(c2.lista.indiceNumero(c1.lista.getTabla()[i])==-1){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto c3 = new Conjunto(0);
            c3.insertarotroConjunto(c1);
        for (int i = 0; i < c1.numeroElemento(); i++) {
            if(c3.contiene(c1.lista.getTabla()[i])){
                c3.insertarFinal(c1.lista.getTabla()[i]);
            }
        }
        return c3;
    }


    @Override
    public String toString() {
        return "Conjunto{" +
                "lista=" + lista +
                '}';
    }
}
