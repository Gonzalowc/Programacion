package Juego2;

import java.util.Objects;

public class Guerrero extends Hombre implements Atacar {
    int edad;
    public Guerrero(String nombre,int edad, int energia, int ataque, int defensa, boolean encantado) {
        super(nombre, energia, ataque, defensa, encantado);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0){
            this.edad = edad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guerrero)) return false;
        Guerrero guerrero = (Guerrero) o;
        return edad == guerrero.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }

    @Override
    public String toString() {
        return "Personaje: Persona -Guerrero\n" +
                super.toString()+"\n"+
                "Edad: " + edad+"\n";
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
