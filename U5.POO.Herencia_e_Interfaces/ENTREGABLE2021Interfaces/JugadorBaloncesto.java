package ENTREGABLE2021Interfaces;

public class JugadorBaloncesto extends Participante implements Encestar{
    private double altura;

    public JugadorBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+nombre+", como  jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                super.toString()+"\n"+
                "Altura: " + altura;
    }
}
