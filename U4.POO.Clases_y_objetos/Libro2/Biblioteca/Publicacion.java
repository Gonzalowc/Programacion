package Libro2.Biblioteca;

public class Publicacion {
    public static void main(String[] args) {
        Libro l1 = new Libro(11111111,"La ruta prohibida", 2007);
        Libro l2 = new Libro(22222222,"Los otros", 2016);
        Libro l3 = new Libro(33333333,"La rosa del mundo", 1995);
        Revista r1 = new Revista(44444444,"Año cero",2019,344);
        Revista r2 = new Revista(55555555,"National Geographi",2003,255);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(r1);
        System.out.println(r2);
        l2.presta();
        if(l2.estaPrestado()){
            System.out.println("Libro prestado");
        }
        l2.presta();
        l2.devuelve();
        if(l2.estaPrestado()){
            System.out.println("Libro prestado");
        }
        l3.presta();
        System.out.println(l2);
        System.out.println(l3);
    }

    private long isbn;
    private String titulo;
    private int yearPubli;

    public Publicacion(long isbn, String titulo, int yearPubli) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.yearPubli = yearPubli;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYearPubli() {
        return yearPubli;
    }

    public void setYearPubli(int yearPubli) {
        this.yearPubli = yearPubli;
    }

    @Override
    public String toString() {
        return "ISBN: "+ getIsbn() +
                ", Título: "+ getTitulo() +
                ", Año publicacion: "+getYearPubli();
    }
}
