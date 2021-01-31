package SECUNDARIO;

public class main {
    public static void main(String[] args) {
        GatoSimple garfield = new GatoSimple("siames", SECUNDARIO.genero.HEMBRA,18);
        garfield.setRaza("Ratonero");
        System.out.println(garfield.getRaza());
        garfield.dormir();


    }
}
