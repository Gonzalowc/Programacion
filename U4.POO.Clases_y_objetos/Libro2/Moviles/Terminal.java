package Libro2.Moviles;

public abstract class Terminal {

    protected String nTelefono;
    protected int segundosUsados;

    public Terminal(String nTelefono) {
        this.nTelefono = nTelefono;
        segundosUsados=0;
    }
    public Terminal(Terminal t){
        this.nTelefono = t.nTelefono;
        segundosUsados = t.getSegundosUsados();
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int getSegundosUsados() {
        return segundosUsados;
    }

    public void setSegundosUsados(int segundosUsados) {
        this.segundosUsados = segundosUsados;
    }

    public abstract void llama(Terminal t2, int segundos);
    @Override
    public String toString() {
        return "Nº: " + nTelefono + " -- " + segundosUsados +"s  de conversación";
    }
}
