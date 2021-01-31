package Libro2.Biblioteca;

public class Revista extends Publicacion {

    int numRevista;



    public Revista(long isbn, String titulo, int yearPubli, int numRevista) {
        super(isbn, titulo, yearPubli);
        this.numRevista =numRevista;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "Nu";
    }
}
