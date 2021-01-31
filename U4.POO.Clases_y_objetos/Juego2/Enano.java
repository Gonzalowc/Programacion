package Juego2;

import java.util.Objects;

public class Enano extends Personaje implements Atacar {
    int alturaCm;

    public Enano(String nombre, int energia, int ataque, int defensa, boolean encantado, int alturaCm) {
        super(nombre, energia, ataque, defensa, encantado);
        this.alturaCm = alturaCm;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        if(alturaCm>0){
            this.alturaCm = alturaCm;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enano)) return false;
        Enano enano = (Enano) o;
        return alturaCm == enano.alturaCm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alturaCm);
    }

    @Override
    public String toString() {
        return "Personaje: Enano" +"\n"+
                super.toString()+"\n" +
                "Altura en Cm: " + alturaCm +"cm\n";
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
