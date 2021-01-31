package PoligonosRegulares;

public class Circulo implements Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(){
        this(10);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n"+
                "radio:" + radio +"cm\n";
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio;
    }

}
