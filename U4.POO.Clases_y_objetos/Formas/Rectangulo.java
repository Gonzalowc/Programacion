package Formas;

public class Rectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(6,2);
        System.out.println(r1);
    }
    int lado;
    int base;
    int rectangulosCreados=0;

    public Rectangulo(int base, int lado ) {
        this.lado = lado;
        this.base = base;
        rectangulosCreados++;
    }

    public String hacerRectangulo(){
        String rectangulo="";
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < base; j++) {
                rectangulo+="*";
            }
            if(i!=lado-1){
                rectangulo+="\n";
            }
        }

        return rectangulo;
    }

    @Override
    public String toString() {
        return hacerRectangulo();
    }
}
