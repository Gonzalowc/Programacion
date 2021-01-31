package Lista;

import java.util.Arrays;

public class PilaTabla {

    Integer[] tabla;
    int cima;


    PilaTabla(int capacidad){
        tabla = new Integer[capacidad];
        cima=0;
    }
    PilaTabla(){
        this(10);
    }

    public void apilar(Integer num){
        tabla[cima] = num;
        cima++;
    }
    public int desapilar(){
        Integer num = tabla[cima];
        tabla[cima] =null;
        cima--;
        return num;
    }
    public boolean pilaVacia(){
        if(cima==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean pilaLlena(){
        if(cima == tabla.length){
            return true;
        }else{
            return false;
        }
    }

    public  int cima(){
        return cima;
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 0; i < cima; i++) {
            mensaje+=tabla[i]+" ";
        }
        mensaje+="<- Cima";
        return mensaje;
    }
}
