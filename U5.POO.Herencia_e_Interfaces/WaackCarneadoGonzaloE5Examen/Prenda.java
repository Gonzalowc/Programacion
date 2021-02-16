package WaackCarneadoGonzaloE5Examen;

import java.util.Objects;

public class Prenda implements Devolver,Doblar{
    protected double precio;
    protected String nombre;
    protected String codigoBarras;
    protected double peso;
    protected static int prendasCreadas=0;

    public Prenda(double precio, String nombre, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = Integer.toString(prendasCreadas);
        prendasCreadas++;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public static int getPrendasCreadas() {
        return prendasCreadas;
    }

    public static void setPrendasCreadas(int prendasCreadas) {
        Prenda.prendasCreadas = prendasCreadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return codigoBarras.equals(prenda.codigoBarras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoBarras);
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre "+this.getNombre() +"y precio"+this.getPrecio());
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.getNombre()+" se puede doblar");
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre +"\n"+
                "precio: " + precio +"\n"+
                "Codigo de Barras: " + codigoBarras + "\n"+
                "Peso: " + peso +"Kg"+"\n____________________";
    }
}
