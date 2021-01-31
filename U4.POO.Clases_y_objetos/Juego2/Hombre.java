package Juego2;

public abstract class Hombre extends Personaje {
    public Hombre(String nombre, int energia, int ataque, int defensa, boolean encantado) {
        super(nombre, energia, ataque, defensa, encantado);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
