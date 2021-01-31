package horicas;

import Horas.Hora;

public class Hores {
    public static void main(String[] args) {
        Hores h = new Hores(22, 49);
        h.inc();
        System.out.println(h);
    }

    protected int horas;
    protected int minutos;

    public Hores(int horas, int minutos) {
        if(horas>=0 && horas<24 && minutos>=0 && minutos<60){
            this.horas = horas;
            this.minutos = minutos;
        }else if(horas>=0 && horas<24){
            this.horas = horas;
            this.minutos = 0;
        }else if(minutos>=0 && minutos<60){
            this.horas = 0;
            this.minutos = minutos;
        }else{
            this.horas = 0;
            this.minutos = 0;
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas>=0 && horas<24){
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<60){
            this.minutos = minutos;
        }
    }

    public void inc(){
        if(minutos<59){
            minutos++;
        }else{
            minutos=0;
            if(horas<23){
                horas++;
            }else{
                horas=0;
            }
        }
    }

    @Override
    public String toString() {
        return horas+":"+minutos;
    }
}
