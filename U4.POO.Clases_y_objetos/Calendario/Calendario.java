package Calendario;

import java.util.Objects;

public class Calendario {
    int anio;
    int mes;
    int dia;

    public void setAnio(int anio) {
        if(anio>0){
            this.anio = anio;
        }
    }

    public void setDia(int dia) {
        if(dia>0 && dia<31){
            this.dia = dia;
        }else{
            System.out.println("Dia no permitido");
        }
    }

    public void setMes(int mes) {
        if(mes>0 && mes<=12){
            this.mes = mes;
        }else{
            System.out.println("Mes no permitido");
        }
    }

    Calendario(int anio, int mes, int dia) {
        this.anio = anio;
        setDia(dia);
        setMes(mes);
    }

    public void incrementarDia(int cantidadDias){
        if(cantidadDias>0) {
            for (int i = 0; i < cantidadDias; i++) {
                if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
                    if (this.dia < 31) {
                        this.dia++;
                    } else {
                        this.dia = 1;
                        incrementarMes(1);
                    }

                } else if (this.mes == 2) {
                    if (this.dia < 28) {
                        this.dia++;
                    } else {
                        this.dia = 1;
                        incrementarMes(1);
                    }
                } else {
                    if (this.dia < 30) {
                        this.dia++;
                    } else {
                        this.dia = 1;
                        incrementarMes(1);
                    }
                }
            }
        }else{
            System.out.println("Introduzca un valor mayor que 0");
        }
    }
    public void incrementarMes(int cantidadMes){

        if(cantidadMes>0){
            for (int i = 0; i < cantidadMes; i++) {
                if(this.mes<12){
                    this.mes++;
                }else{
                    this.mes=1;
                    incrementarAnio(1);
                }
            }
        }else{
            System.out.println("Introduzca un valor mayor que 0");
        }

    }
    public void incrementarAnio(int cantidadAnio){
        if(cantidadAnio>0){
            this.anio+=cantidadAnio;
        }
    }

    public void mostrar(){
        System.out.println("Año: "+this.anio);
        System.out.println("Mes: "+this.mes);
        System.out.println("Día: "+this.dia);
    }

    public boolean iguales(Calendario otraFecha){
        if(this.equals(otraFecha)){
            System.out.println("Son fechas iguales");
            return true;
        }else{
            System.out.println("Son fechas diferentes");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendario that = (Calendario) o;
        return anio == that.anio &&
                mes == that.mes &&
                dia == that.dia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anio, mes, dia);
    }
}
