package Instrumentos;

import java.util.Arrays;

abstract class Instrumento {
    protected NotasMusicales[] notasMusicales;
    protected int maximasNotas;

    public Instrumento() {
        this.notasMusicales = new NotasMusicales[0];
        this.maximasNotas = 100;
    }
    public void add(NotasMusicales nota){
        if(notasMusicales.length<maximasNotas){
            notasMusicales = Arrays.copyOf(notasMusicales,notasMusicales.length+1);
            notasMusicales[notasMusicales.length-1] = nota;
        }
    }
    abstract void interpretar();
}
