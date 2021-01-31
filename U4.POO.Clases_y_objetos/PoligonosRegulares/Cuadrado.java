package PoligonosRegulares;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(int longitudLado, Color color) {
        super(longitudLado,color);
    }
    public Cuadrado(int longitudLado){
        super(longitudLado,Color.AZUL);
    }
    public Cuadrado(Color color){
        super(10,color);
    }
    public Cuadrado(){
        super(10,Color.AZUL);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n"+
                super.toString();
    }

    @Override
    public double getArea() {
        return lado*lado;
    }
}
