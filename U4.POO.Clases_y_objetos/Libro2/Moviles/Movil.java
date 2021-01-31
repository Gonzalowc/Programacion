package Libro2.Moviles;

public class Movil extends Terminal {
    public static void main(String[] args) {
        Movil m1 = new Movil("678 11 22 33", Tarifas.RATA);
        Movil m2 = new Movil("644 74 44 69", Tarifas.MONO);
        Movil m3 = new Movil("622 32 89 09", Tarifas.BISONTE);
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
    private Tarifas tarifa;
    private int precioCentimos;
    private int segundosPropios;
    private double tarificado;

    public Movil(String nTelefono, Tarifas tarifa) {
        super(nTelefono);
        this.tarifa = tarifa;
        precioCentimos = tarifa.precio;
        tarificado=0;
    }

    public Movil(Terminal t, Tarifas tarifa) {
        super(t);
        this.tarifa = tarifa;
        precioCentimos = tarifa.precio;
        tarificado=0;
    }

    public Tarifas getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifas tarifa) {
        this.tarifa = tarifa;
        this.precioCentimos = tarifa.precio;
    }

    public int getPrecioCentimos() {
        return precioCentimos;
    }

    public int getSegundosPropios() {
        return segundosPropios;
    }

    public void setSegundosPropios(int segundosPropios) {
        this.segundosPropios = segundosPropios;
    }
    public double getPrecioTarificado(){
        return tarificado;
    }

    @Override
    public void llama(Terminal t2, int segundos) {
        segundosPropios+=segundos;
        t2.segundosUsados+=segundos;
        segundosUsados+=segundos;
        tarificado+=(((double)segundos/60)*precioCentimos)/100;
    }

    @Override
    public String toString() {
        return super.toString()+ " - "+ getPrecioTarificado() +" euros";
    }
}