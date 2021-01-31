package CasaBombillas;

import java.util.Arrays;

public class Casa {

    Bombilla[] b;
    boolean fusible= true;
    Casa(){
        this.b = new Bombilla[0];
    }

    public void addBombilla(){
        b = Arrays.copyOf(b, b.length+1);
        b[b.length-1] = new Bombilla();
    }
    public void addBombilla(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            this.addBombilla();
        }
    }

    public void interruptor(int numBombilla){
        if(numBombilla>=0 && numBombilla<b.length){
            b[numBombilla].interruptor();
        }
    }
    public void quitarEnergia(){
        fusible=false;
    }
    public void ponerEnergia(){
        fusible =true;
    }

    public void estadoBombilla (){
        for (int i = 0; i < b.length; i++) {
            if(!fusible){
                if(i==0){
                    System.out.println("Fusible estropeado o sin energía");
                }
                System.out.println("Bombilla "+i+": Apagada");
            }else if(fusible && b[i].estadoBombilla()){
                System.out.println("Bombilla "+i+": Encendida");
            }else{
                System.out.println("Bombilla "+i+": Apagada");
            }
        }
    }
}
