package Juego2;


import java.util.Objects;

public class Elfo extends Personaje implements Atacar {
    TipoElfo tipo;
    public Elfo(String nombre, int energia, int ataque, int defensa, boolean encantado, TipoElfo tipo) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elfo)) return false;
        Elfo elfo = (Elfo) o;
        return tipo == elfo.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    @Override
    public String toString() {
        return "Personaje : Elfo" +"\n"+
                super.toString()+"\n" +
                "Tipo: " + tipo + "\n";
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
