package Juego2;

public interface Magia {
    default Personaje encantar(Personaje personaje){
        if(!personaje.isEncantado()){
            personaje.setEncantado(true);
        }
        return personaje;
    }
    default Personaje desencantar(Personaje personaje){
        if(personaje.isEncantado()){
            personaje.setEncantado(false);
        }
        return personaje;
    }
}
