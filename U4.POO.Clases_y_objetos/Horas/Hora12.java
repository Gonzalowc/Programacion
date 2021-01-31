package Horas;

import java.util.Objects;

public class Hora12 extends Hora {
    ParteHoraria parteHoraria;

    public Hora12(int horas, int minutos, ParteHoraria parteHoraria) {
        super(horas, minutos);
            if(super.horas>12){
                super.horas = horas-12;
            }

        this.parteHoraria = parteHoraria;
    }

    public ParteHoraria getParteHoraria() {
        return parteHoraria;
    }

    public void setParteHoraria(ParteHoraria parteHoraria) {
        this.parteHoraria = parteHoraria;
    }
    @Override
    protected void incHora(){
        if(parteHoraria.equals(ParteHoraria.PM)) {
            if (horas < 11) {
                horas++;
            } else {
                parteHoraria = ParteHoraria.AM;
                horas = 0;
            }
        }else{
            if (horas < 12) {
                horas++;
            } else {
                parteHoraria = ParteHoraria.PM;
                horas = 1;
            }
        }
    }

    @Override
    public void setHoras(int horas){
        if(horas>=0 && horas<=12){
            this.horas = horas;
        }
    }

    @Override
    public String toString() {
        return super.toString() +" "+parteHoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hora12)) return false;
        if (!super.equals(o)) return false;
        Hora12 hora12 = (Hora12) o;
        return parteHoraria == hora12.parteHoraria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parteHoraria);
    }
}
