package Juego2;

public interface Atacar {
    /*default void atacarPersonaje(Personaje atacante, Personaje atacado){
        if(atacante instanceof Atacar){
            if(atacante.getClass().getSimpleName().equals(atacado.getClass().getSimpleName()) && atacante.getNombre().equals(atacado.getNombre())){
                System.out.println("Un personaje no se puede atacar a sí mismo");
            }else{
                System.out.println(atacante.getNombre() +" - "+ atacante.getClass().getSimpleName() +" - ATACANDO");
                System.out.println(atacado.getNombre() +" - "+ atacado.getClass().getSimpleName() +" - ME ATACAN");
                if(!atacante.getClass().getSimpleName().equals(atacado.getClass().getSimpleName())){
                    if(atacado.isEncantado()){
                        atacado.setEnergia(atacado.getEnergia()-2*(atacante.getAtaque()-atacado.getDefensa()));
                    }else{
                        atacado.setEnergia(atacado.getEnergia()-(atacante.getAtaque()-atacado.getDefensa()));
                    }
                }
            }

        } else{
            System.out.println("El atacante elegido no ataca.");
        }
    }*/
    Personaje atacarPersonaje(Personaje atacado);
}
