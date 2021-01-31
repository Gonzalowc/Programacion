package Juego2;

import java.util.Comparator;
import java.util.Objects;

public abstract class Personaje implements Comparable<Personaje>{
    protected String nombre;
    protected int energia;
    protected int ataque;
    protected int defensa;
    protected boolean encantado;

    public Personaje(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        this.nombre = nombre;
        setEnergia(energia);
        setAtaque(ataque);
        setDefensa(defensa);
        this.encantado = encantado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if(ataque>0 && ataque<=100){
            this.ataque = ataque;
        }else{
            this.ataque = 60;
        }

    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if(defensa>=0 && defensa<=100){
            this.defensa = defensa;
        }else{
            this.defensa = 0;
        }
    }

    public boolean isEncantado() {
        return encantado;
    }
    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return energia == personaje.energia &&
                ataque == personaje.ataque &&
                defensa == personaje.defensa &&
                encantado == personaje.encantado &&
                Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, energia, ataque, defensa, encantado);
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Energia: " + energia +"\n" +
                "Ataque: " + ataque +"\n" +
                "Defensa: " + defensa + "\n" +
                "Encantado: " + encantado;
    }
    @Override
    public int compareTo(Personaje personaje){
        return personaje.energia-this.energia;
    }

    public static class mostrarxAtaque implements Comparator<Personaje>{
        @Override
        public int compare(Personaje p1, Personaje p2){
            return p2.ataque-p1.ataque;
        }
    }
    public static class mostrarxDefensa implements Comparator<Personaje>{
        @Override
        public int compare(Personaje p1, Personaje p2){
            return p2.defensa-p1.defensa;
        }
    }
}
