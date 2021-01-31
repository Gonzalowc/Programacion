package Juego2;

import java.util.Objects;

public class Mago extends Personaje implements Magia {
    int longBarbaCm;
    public Mago(String nombre, int energia, int ataque, int defensa, boolean encantado, int longitudBarba) {
        super(nombre, energia, ataque, defensa, encantado);
        longBarbaCm = longitudBarba;
    }

    public int getLongBarbaCm() {
        return longBarbaCm;
    }

    public void setLongBarbaCm(int longBarbaCm) {
        if(longBarbaCm>=0){
            this.longBarbaCm = longBarbaCm;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mago)) return false;
        Mago mago = (Mago) o;
        return longBarbaCm == mago.longBarbaCm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longBarbaCm);
    }

    @Override
    public String toString() {
        return "Personaje: Persona - Mago" +"\n" +
                super.toString()+"\n"+
                "Longitud de la barba: " + longBarbaCm +"cm \n";
    }

}
