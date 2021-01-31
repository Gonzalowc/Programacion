package Compa;

import java.util.Comparator;

public class Libro implements Comparable<Libro>{
    private String isbn;
    private int paginas;
    private double precio;
    private String autor;
    private String editoral;

    public Libro(String isbn, int paginas, double precio, String autor, String editoral) {
        this.isbn = isbn;
        this.paginas = paginas;
        this.precio = precio;
        this.autor = autor;
        this.editoral = editoral;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditoral() {
        return editoral;
    }

    public void setEditoral(String editoral) {
        this.editoral = editoral;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.getIsbn().compareToIgnoreCase(libro.getIsbn());
    }

    public static class comparaLibroPorISBN implements Comparator<Libro> {

        @Override
        public int compare(Libro libro1, Libro libro2) {
            return libro1.getIsbn().compareToIgnoreCase(libro2.getIsbn());
        }
    }
    public static class comparaLibroPorNPaginas implements Comparator<Libro> {

        @Override
        public int compare(Libro libro1, Libro libro2) {
            return libro1.getPaginas()-libro2.getPaginas();
        }
    }
    public static class comparaLibroPorAutor implements Comparator<Libro>{
        @Override
        public int compare(Libro libro1, Libro libro2){
            return libro1.getAutor().compareToIgnoreCase(libro2.getAutor());
        }
    }
    public static class comparalibroPorPrecioAsc implements Comparator<Libro>{
        @Override
        public int compare(Libro libro1, Libro libro2){
            if(libro1.getPrecio()-libro2.getPrecio()>0){
                return 1;
            }else if(libro1.getPrecio()-libro2.getPrecio()<0){
                return -1;
            }
            return 0;
        }
    }
    public static class comparalibroPorPrecioDes implements Comparator<Libro>{
        @Override
        public int compare(Libro libro1, Libro libro2){
            if(libro1.getPrecio()-libro2.getPrecio()>0){
                return -1;
            }else if(libro1.getPrecio()-libro2.getPrecio()<0){
                return 1;
            }
            return 0;
        }
    }
    public static class comparalibroPorEditoral implements Comparator<Libro>{
        @Override
        public int compare(Libro libro1, Libro libro2){
            return libro2.getEditoral().compareToIgnoreCase(libro1.getEditoral());
        }
    }

}
