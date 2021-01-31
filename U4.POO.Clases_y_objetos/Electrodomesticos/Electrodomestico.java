package Electrodomesticos;

public abstract class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected Letras consumoEnergetico;
    protected double peso;

    public Electrodomestico(double precioBase, String color, Letras consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
        this(100,"blanco",Letras.F,5);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase,"blanco",Letras.F,peso);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Letras getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Letras consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double getPrecioConsumo(){
        double precioConsumo=0;
        switch (consumoEnergetico){
            case A:
                precioConsumo+=100;
                break;
            case B:
                precioConsumo+=80;
                break;
            case C:
                precioConsumo+=60;
                break;
            case D:
                precioConsumo+=50;
                break;
            case E:
                precioConsumo+=30;
                break;
            case F:
                precioConsumo+=10;
                break;
        }
        return precioConsumo;
    }
    private double getPrecioPeso(){
        double precioPeso = 0;
        if(peso>=0 && peso<30){
            precioPeso+=10;
        }else if( peso>=30 && peso<50){
            precioPeso+=60;
        }else if(peso>=50 && peso<80){
            precioPeso+=80;
        }else {
            precioPeso+=100;
        }
        return precioPeso;
    }
    public double getPrecioFinal(){
        return precioBase+getPrecioPeso()+getPrecioConsumo();

    }

    @Override
    public String toString() {
        return "Precio Base: " + precioBase +"€\n"+
                "Color: " + color +
                "\nConsumo Energetico: " + consumoEnergetico +
                "\nPeso: " + peso +"Kg"+
                "\nPrecio Final: "+getPrecioFinal()+"€\n";
    }
}
