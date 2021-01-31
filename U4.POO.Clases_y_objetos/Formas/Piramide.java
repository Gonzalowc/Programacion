package Formas;

public class Piramide {
    public static void main(String[] args) {
        Piramide p = new Piramide(5);
        System.out.println(p);
        System.out.println(Piramide.cantidadPiramides);
    }
    int altura;
    public static int cantidadPiramides;
    public Piramide(int altura) {
        if(altura>0){
            this.altura = altura;
        }else{
            this.altura = 3;
        }
        cantidadPiramides++;
    }

    public String crearPiramide(){
        String piramide="";
        for (int i = 1; i <=altura ; i++) {
            for (int j = 1; j <altura*2 ; j++) {
                if(j>=altura+i || j+i<altura+1){
                    piramide+=" ";
                }else{
                    piramide+="*";
                }
            }
            if(i!=altura){
                piramide+="\n";
            }

        }
        return piramide;
    }

    @Override
    public String toString() {
        return crearPiramide();
    }
}
