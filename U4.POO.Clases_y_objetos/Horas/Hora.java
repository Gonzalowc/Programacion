package Horas;

import java.util.Objects;

public class Hora {
    protected int horas;
    protected int minutos;

    public Hora(int horas, int minutos) {
        if(horas>=0 && horas<24 && minutos>=0 && minutos<60){
            this.horas = horas;
            this.minutos = minutos;
        }else if(minutos>=0 && minutos<60) {
            this.horas = 12;
            this.minutos = minutos;
        }else if(horas>=0 && horas<24){
            this.horas = horas;
            this.minutos = 0;
        }else{
            this.horas=0;
            this.minutos=0;
        }
    }
    public Hora(){
        this.horas = 12;
        this.minutos = 0;
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
            incHora();
        }
    }
    protected void incHora(){
        if(horas<23){
            horas++;
        }else{
            horas=0;
        }
    }

    @Override
    public String toString() {
        String minuto="";
        String hora="";
        if(horas<10 && minutos<10){
            hora="0"+horas;
            minuto="0"+minutos;
        }else if(horas<10){
            hora="0"+horas;
            minuto+=minutos;
        }else if(minutos<10){
            hora+=+horas;
            minuto="0"+minutos;
        }else{
            hora+=horas;
            minuto+=minutos;
        }
        return "Hora: " + hora +
                ":" + minuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hora)) return false;
        Hora hora = (Hora) o;
        return horas == hora.horas &&
                minutos == hora.minutos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horas, minutos);
    }
}
