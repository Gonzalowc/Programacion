package Libro2.Biblioteca;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(long isbn, String titulo, int yearPubli) {
        super(isbn, titulo, yearPubli);
        prestado = false;
    }

    @Override
    public void presta() {
        if(prestado){
            System.out.println("Lo siento, ese libro ya está prestado");
        }else{
            setPrestado(true);
        }
    }

    @Override
    public void devuelve() {
        if(prestado){
            setPrestado(false);
        }else{
            System.out.println("El libro no se ha sacado, ¿como lo ha obtenido?");
        }
    }

    @Override
    public boolean estaPrestado() {
        if(prestado){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" "+(estaPrestado() ? "(prestado)" : "(no prestado)");
    }
}
