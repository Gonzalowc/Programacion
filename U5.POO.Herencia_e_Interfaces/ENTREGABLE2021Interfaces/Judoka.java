package ENTREGABLE2021Interfaces;

public class Judoka extends Participante implements Luchar{
    private int peso;

    public Judoka(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+nombre+", como Judoka, juro los valores deportivos mundiales");
    }

    @Override
    public void luchar() {
        System.out.println("Voy a pelear");
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                super.toString()+"\n"+
                "Peso: " + peso;
    }
}
