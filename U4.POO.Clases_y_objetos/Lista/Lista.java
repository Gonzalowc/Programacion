package Lista;

import java.util.Arrays;

public class Lista {

    public static void main(String[] args) {
        Lista l = new Lista();
        System.out.println(l.elementosInsertados());
        l.insertarPrincipio(1);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarPrincipio(0);
        l.insertarFinal(3);
        l.incrementarEspacio(10);
        System.out.println(l.elementosInsertados());
        System.out.println(l);
        l.borrarElementoLista(2);
        System.out.println(l);
    }
    Integer[] tabla;
    int cima;
    public Lista() {
        tabla = new Integer[10];
        cima=-1;
    }

    public Lista(int longitud) {
        tabla = new Integer[longitud];
        cima=-1;
    }
    public boolean listaLLena(){
        if(cima==tabla.length){
            return true;
        }else
            return false;
    }
    public boolean listaVacia(){
        if(cima==-1){
            return true;
        }else{
            return false;
        }
    }

    public Integer[] getTabla() {
        return tabla;
    }

    public int getLongTabla() {
        return tabla.length;
    }

    public int elementosInsertados() {
        return cima+1;
    }

    public void insertarPrincipio(int numero) {
        Integer anterior = null, siguiente = null;
        for (int i = 0; i < tabla.length; i++) {
            if (i == 0) {
                anterior = tabla[i];
                tabla[i] = numero;
            } else {
                if (i == tabla.length - 1 && tabla[i] != null) {
                    tabla = Arrays.copyOf(tabla, tabla.length + 1);
                    siguiente = tabla[i];
                    tabla[i] = anterior;
                    tabla[i + 1] = siguiente;
                    break;
                } else {
                    siguiente = tabla[i];
                    tabla[i] = anterior;
                    anterior = siguiente;
                }
            }
        }
        posicionUltimoElemento();
    }
    public void incrementarEspacio(int cantidad){
        tabla = Arrays.copyOf(tabla,tabla.length+cantidad);
    }
    public void insertarFinal(int numero) {
        if(tabla[cima]!=null){
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length-1] = numero;
        }else {
            tabla[cima] = numero;
        }
        posicionUltimoElemento();
    }
    private void posicionUltimoElemento(int min){
        for (int i = min; i < tabla.length; i++) {
            if(tabla[i]!=null){
                cima=i;
            }
        }
    }
    private void posicionUltimoElemento(){
        for (int i = 0; i < tabla.length; i++) {
            if(tabla[i]!=null){
                cima=i;
            }
        }
    }
    public boolean insertarPosicion(int index, int numero){
        if(index>=0 && index<tabla.length){
            if(tabla[index]!=null){
                System.out.println("Posición '"+index+"' ocupada");
                return false;
            }else{
                tabla[index] = numero;
                posicionUltimoElemento();
                return true;
            }
        }else{
            System.out.println("Indice fuera de rango");
            return false;
        }

    }
    public boolean insertarPosicionCambiar(int index, int numero){
        if(index>=0 && index<tabla.length){
            if(tabla[index]==null){
                tabla[index] = numero;
                posicionUltimoElemento(index);
            }else{
                tabla[index] = numero;
            }
            return true;
        }else{
            return false;
        }
    }
    public void insertarOtraLista(Lista l){
        tabla = Arrays.copyOf(tabla,cima+l.elementosInsertados()-1);
        int cont=0;
        Integer[]  aux = l.getTabla();
        for (int i = cima; i <tabla.length; i++) {
            if(aux[cont]!=null){
                insertarPosicion(i,aux[cont]);
                cont++;
            }else{
                break;
            }
        }
        posicionUltimoElemento();
    }
    public void borrarElementoLista(int index){
        if(index>=0 && index<tabla.length && tabla[index]!=null){
            tabla[index] = null;
            posicionUltimoElemento(index);
        }else{
            System.out.println("posición ya vacía");
        }
        /*Integer[] anterior = Arrays.copyOf(tabla,index);
        //sub array desde index hasta maximo
        Integer[] siguiente = subArray(index+1,tabla.length,tabla);
        for (int i = 0; i < anterior.length; i++) {
            tabla[i] = anterior[i];
        }
        int cont=0;
        for (int i = anterior.length; i <tabla.length ; i++) {
            if(cont<siguiente.length){
                tabla[i] = siguiente[cont];
                cont++;
            }
        }
        tabla[tabla.length-1]=null;
        if(tabla[cima]==null){
            cima--;
        }*/
    }
    private Integer[] subArray(int indexInit,int indexFinit, Integer[] v){
        Integer[] aux = new Integer[indexFinit-indexInit];
        int contador=0;
        for (int i = indexInit; i <indexFinit ; i++) {
            aux[contador] = v[i];
            contador++;
        }
        return aux;
    }

    public void obtenerInfoElementoDeLista(int index){
        if(index>=0 && index<tabla.length){
            System.out.println("Elemento "+index+": "+tabla[index]);
        }else{
            System.out.println("Índice fuera de rango");
        }
    }
    public Integer valorEnIndice(int index){
        if(index>=0 && index<tabla.length){
            return tabla[index];
        }else{
            return null;
        }
    }

    public int indiceNumero(int num){
        for (int i = 0; i < tabla.length; i++) {
            if(tabla[i]!=null){
                if(tabla[i]==num){
                    return i;
                }
            }
        }
        return -1;
    }
    public int[] indiceNumero(int num, int MaxIndices){
        int cont=0;
        int[] indices = new int[0];
        for (int i = 0; i < tabla.length; i++) {
            if(cont<=MaxIndices){
                if(tabla[i]!=null){
                    if(tabla[i]==num){
                        indices = Arrays.copyOf(indices,indices.length+1);
                        indices[indices.length-1] = i;
                        cont++;
                    }
                }
            }else{
                break;
            }
        }
        return indices;
    }

    @Override
    public String toString() {
        return "Lista:"+ Arrays.toString(tabla);
    }
}
