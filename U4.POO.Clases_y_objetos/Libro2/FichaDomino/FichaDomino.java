package Libro2.FichaDomino;

public class FichaDomino {
    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6,1);
        FichaDomino f2 = new FichaDomino(0,4);
        FichaDomino f3 = new FichaDomino(3,3);
        FichaDomino f4 = new FichaDomino(0,1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
    }

    private int derecho;
    private int izquierdo;

    public FichaDomino(int izquierdo, int derecho) {
        setDerecho(derecho);
        setIzquierdo(izquierdo);
    }

    public int getDerecho() {
        return derecho;
    }

    public void setDerecho(int derecho) {
        if(derecho>=0 && derecho<=6){
            this.derecho = derecho;
        }
    }

    public int getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(int izquierdo) {
        if(derecho>=0 && derecho<=6){
            this.izquierdo = izquierdo;
        }
    }
    public FichaDomino voltea(){
        int aux = getDerecho();
        setDerecho(getIzquierdo());
        setIzquierdo(aux);
        return this;
    }

    public boolean encaja( FichaDomino f2){
        if(f2.getDerecho()==getDerecho() || f2.getIzquierdo()==getIzquierdo() ||
        f2.getIzquierdo()==getDerecho() || f2.getDerecho()==getIzquierdo()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        if(derecho==0 && izquierdo==0){
            return "[ |" + derecho + "]";
        }else if(derecho==0){
            return "[" + izquierdo +
                    "| ]";
        }else if(izquierdo==0){
            return "[ | ]";
        }else{
            return "[" + izquierdo +
                    "|" + derecho + "]";
        }
    }
}
