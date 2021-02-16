package WaackCarneadoGonzaloE5Examen;

public class PrendaColgada extends Prenda implements Colgar{
    private double alturaPrenda;

    public PrendaColgada(String nombre, double precio, double alturaPrenda, double peso) {
        super(precio, nombre, peso);
        this.alturaPrenda = alturaPrenda;
    }

    public double getAlturaPrenda() {
        return alturaPrenda;
    }

    public void setAlturaPrenda(double alturaPrenda) {
        this.alturaPrenda = alturaPrenda;
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.getNombre()+" no se puede doblar");
    }

    @Override
    public void colgar() {
        System.out.println("La prenda "+this.getNombre()+" está colgada");
    }

    @Override
    public String toString() {
        return "Colgada: Si"+"\n"+
                "Altura de la Prenda: " + alturaPrenda+"\n"+
                super.toString()+"\n";
    }
}
