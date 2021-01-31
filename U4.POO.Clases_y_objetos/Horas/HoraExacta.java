package Horas;

import java.util.Objects;

public class HoraExacta extends Hora {
    int segundos;

    public HoraExacta(int horas, int minutos, int segundos) {
        super(horas, minutos);
        if(segundos>=0 && segundos<60){
            this.segundos = segundos;
        }else{
            this.segundos = 0;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos>=0 && segundos<60){
            this.segundos = segundos;
        }
    }
    @Override
    public void inc(){
        if(segundos<59){
            segundos++;
        }else{
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        String segundo="";
        if(segundos<10){
            segundo="0"+segundos;
        }else{
            segundo+=segundos;
        }
        return super.toString()+":"+segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HoraExacta)) return false;
        if (!super.equals(o)) return false;
        HoraExacta that = (HoraExacta) o;
        return segundos == that.segundos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), segundos);
    }
}
