package PoligonosRegulares;

public abstract class PoligonoRegular implements Figura {
    protected int lado;
    public Color color;
    private static int contadorPoligonos=0;

    public PoligonoRegular(int lado, Color color){
        this.lado = lado;
        this.color = color;
        addContadorPoligonos();
    }
    private static void addContadorPoligonos(){
        contadorPoligonos++;
    }

    public static int getContadorPoligonos(){
        return contadorPoligonos;
    }
    @Override
    public String toString() {
        return "Lado: " + lado +"cm\n"+
               "Color: " + color +"\n";
    }
}
