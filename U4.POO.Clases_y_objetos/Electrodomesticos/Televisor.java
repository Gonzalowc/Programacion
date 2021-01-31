package Electrodomesticos;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintTDT;

    public Televisor(double precioBase, String color, Letras consumoEnergetico, double peso, int resolucion, boolean sintTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase,peso);
        this.resolucion = 30;
        this.sintTDT = false;
    }

    public Televisor(int resolucion, boolean sintTDT) {
        super();
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }
    public double getPrecioFinal(){
        double precioFinal = super.getPrecioFinal();
        if(resolucion>40){
            precioFinal+=precioFinal*0.3;
        }
        if(sintTDT){
            precioFinal+=50;
        }
        return precioFinal;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n"+
                "Precio Base: " + precioBase +"€\n"+
                "Color: " + color +
                "\nConsumo Energetico: " + consumoEnergetico +
                "\nPeso: " + peso +"Kg"+
                "\nResolución: "+ resolucion+"\""+
                "\nSintonizador TDT: "+((sintTDT)? "Si":"No")+
                "\nPrecio Final: "+getPrecioFinal()+"€\n";
    }
}
