package PoligonosRegulares;

import Clientes.Cliente;

import java.util.Comparator;

public class Triangulo extends PoligonoRegular implements Comparators{
    double altura;
    public Triangulo(int lado, double altura, Color color) {
        super(lado,color);
        this.altura = altura;

    }
    public Triangulo(){
        this(10,10,Color.AZUL);
    }
    public Triangulo(int lado){
        this(lado,10, Color.AZUL);
    }
    public Triangulo(double altura){
        this(10,altura,Color.AZUL);
    }
    public Triangulo(Color color){
        this(10,10,color);
    }
    public Triangulo(int lado, double altura){
        this(lado,altura,Color.AZUL);
    }

    @Override
    public double getArea() {
        return (double)(lado*altura)/2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n" +
                super.toString()+
                "Altura: "+altura+"cm\n";
    }

    @Override
    public int compare(PoligonoRegular pr1, PoligonoRegular pr2) {
        return pr1.lado-pr2.lado;
    }

    static class ladoComparator implements Comparator<PoligonoRegular> {
        @Override
        public int compare(PoligonoRegular pr1, PoligonoRegular pr2) {
            return pr1.lado-pr2.lado;
        }
    }
    static class ColorAlfComparator implements Comparator<PoligonoRegular>{
        @Override
        public int compare(PoligonoRegular pr1, PoligonoRegular pr2) {
            return pr1.color.compareTo(pr2.color);
        }
    }

}
