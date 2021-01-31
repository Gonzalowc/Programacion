package Lista;

public class PilaLista implements Pila {
    public static void main(String[] args) {

    }
    int cimaPila;
    Lista lista;

    PilaLista(){
        lista = new Lista();
        cimaPila = -1;
    }
    PilaLista(int capacidad){
        lista = new Lista(capacidad);
        cimaPila = -1;
    }
    private boolean pilaVacia(){
        return cimaPila == -1;
    }
    private boolean pilaLlena(){
        return lista.listaLLena();
    }

    public Integer cima(){
        return lista.cima;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
    public void apilar(Integer num){
        cimaPila++;
        lista.insertarPosicion(cimaPila,num);

    }
    public Integer desapilar(){
        Integer valor = lista.valorEnIndice(cimaPila);
        lista.borrarElementoLista(cimaPila);
        cimaPila--;
        return valor;
    }

    @Override
    public void ordenInverso() {
        for (int i = cimaPila; i >=0 ; i--) {
            System.out.println(lista.getTabla()[i]+" ");
        }
    }
}
