package Libro2.Amebas;

public class Ameba {
    public static void main(String[] args) {
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int cantidad){
        fagocitar();
        this.peso+=cantidad;
    }
    public void come(Ameba a2){
        fagocitar();
        this.peso+=a2.getPeso();
        a2.setPeso(0);
    }
    private void fagocitar(){
        this.peso--;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+peso+" microgramos";
    }
}
