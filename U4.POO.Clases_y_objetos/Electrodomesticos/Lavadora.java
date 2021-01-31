package Electrodomesticos;

public class Lavadora extends Electrodomestico implements Comparable<Lavadora>{
    private double carga;

    public Lavadora(double precioBase, String color, Letras consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(double carga) {
        super();
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    @Override
    public double getPrecioFinal(){
        double precioFinal = super.getPrecioFinal();
        if(carga>30){
            precioFinal+=30;
        }
        return precioFinal;
    }
    @Override
    public String toString() {
        return  getClass().getSimpleName()+"\n"+
                "Precio Base: " + precioBase +"€\n"+
                "Color: " + color +
                "\nConsumo Energetico: " + consumoEnergetico +
                "\nPeso: " + peso +
                "\nCarga: "+ carga+"Kg"+
                "\nPrecio Final: "+getPrecioFinal()+"€\n";
    }


    @Override
    public int compareTo(Lavadora lav) {
        return 0;
    }
}
