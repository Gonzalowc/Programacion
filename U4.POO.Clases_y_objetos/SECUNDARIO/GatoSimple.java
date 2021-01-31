package SECUNDARIO;

public class GatoSimple {
    public static void main(String[] args) {
        GatoSimple garfield = new GatoSimple("siames", SECUNDARIO.genero.HEMBRA,18);
        GatoSimple elGatoFalso = new GatoSimple("Callejero", SECUNDARIO.genero.MACHO,16);
        System.out.println(garfield.raza);
        garfield.comer("queso");
        garfield.comer("comida para gatos");
        garfield.dormir();
        garfield.maullar();
        garfield.peleaCon(elGatoFalso);
        System.out.println(garfield);
    }
    private String raza;
    private genero genero;
    private int edad;

    public GatoSimple(String raza, SECUNDARIO.genero genero, int edad) {
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
        maullar();
    }
    public GatoSimple(SECUNDARIO.genero genero, int edad) {
        this.raza = "";
        this.genero = genero;
        System.out.println(getEdad());
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public SECUNDARIO.genero getGenero() {
        return genero;
    }
    public void setGenero(SECUNDARIO.genero genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(String comida){
        if(comida.equals("comida para gatos")){
            System.out.println("MMMM que rico la "+comida);
            maullar();
        }else{
            System.out.println("Lo siento, no me gusta la/el "+comida);
            maullar();
            maullar();
        }
    }
    public void dormir(){
        System.out.println("ZzzZZzZZzz");
        maullar();
    }
    private void maullar(){
        System.out.println("miauUUUUUUUUUU");
    }
    public boolean peleaCon(GatoSimple contrincante){
        if(this.getEdad()>contrincante.getEdad() && this.getGenero()!= SECUNDARIO.genero.HEMBRA && contrincante.getGenero()!= SECUNDARIO.genero.HEMBRA){
            System.out.println("Soy el má fuehte");
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Raza: "+ raza+"\n"+
                "Genero: "+genero+"\n"+
        "Edad: "+edad+"\n"+
        "_________________________________\n";

    }
}
