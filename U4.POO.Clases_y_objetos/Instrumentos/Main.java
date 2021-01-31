package Instrumentos;

public class Main {
    public static void main(String[] args) {
        Instrumento piano  = new Piano();
        Instrumento campana = new Campana();
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.SOL);
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.DO);
        campana.interpretar();
        System.out.println();
        System.out.println("Piano");
        piano.add(NotasMusicales.DO);
        piano.add(NotasMusicales.DO);
        piano.add(NotasMusicales.SOL);
        piano.add(NotasMusicales.DO);
        piano.add(NotasMusicales.DO);
        piano.interpretar();
    }
}
