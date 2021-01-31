package FM;

public class RadioFM {
    static final double frecuenciaMax = 108;
    static final double frecuenciaMin = 80;
    double frecuenciaActual;
    static final double salto=0.5;

    public RadioFM(){
        this.frecuenciaActual = frecuenciaMin;
    }

    public void up(){

        this.frecuenciaActual+=salto;
        if(this.frecuenciaActual>frecuenciaMax){
            this.frecuenciaActual = frecuenciaMin;
        }
    }
    public void down(){
        this.frecuenciaActual-=salto;
        if(this.frecuenciaActual<frecuenciaMin){
            this.frecuenciaActual = frecuenciaMax;
        }
    }
    public void display(){
        System.out.println("Frecuencia: "+this.frecuenciaActual+"MHz");
    }

}
