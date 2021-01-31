package Juego2;

import java.util.Objects;

public class Orco extends Personaje implements Atacar {
    int tonelaje;

    public Orco(String nombre, int energia, int ataque, int defensa, boolean encantado, int tonelaje) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tonelaje = tonelaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orco)) return false;
        Orco orco = (Orco) o;
        return tonelaje == orco.tonelaje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tonelaje);
    }

    @Override
    public String toString() {
        return "Personaje: Orco" +"\n" +
                super.toString()+"\n" +
                "Tonelaje: " + tonelaje+"\n";
    }
    @Override
    public Personaje atacarPersonaje(Personaje atacado){
        if(this.getClass().getSimpleName().equals(atacado.getClass().getSimpleName()) && this.getNombre().equals(atacado.getNombre())){
            System.out.println("Un personaje no se puede atacar a sí mismo");
        }else{
            System.out.println(this.getNombre() +" - "+ this.getClass().getSimpleName() +" - ATACANDO");
            System.out.println(atacado.getNombre() +" - "+ atacado.getClass().getSimpleName() +" - ME ATACAN");
            if(!this.getClass().getSimpleName().equals(atacado.getClass().getSimpleName())){
                if(atacado.isEncantado()){
                    atacado.setEnergia(atacado.getEnergia()-2*(this.getAtaque()-atacado.getDefensa()));
                }else{
                    atacado.setEnergia(atacado.getEnergia()-(this.getAtaque()-atacado.getDefensa()));
                }
            }
        }
        return atacado;
    }
}
