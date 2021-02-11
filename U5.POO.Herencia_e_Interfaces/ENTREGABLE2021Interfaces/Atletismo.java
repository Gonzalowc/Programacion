package ENTREGABLE2021Interfaces;

public class Atletismo extends Deporte {
    int numPruebas;
    public Atletismo(String nombre, String pabellon, int numPruebas) {
        super(nombre, pabellon);
        this.numPruebas = numPruebas;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    public void addAtleta(Atleta atleta){
        addParticipante(atleta);
    }
    public void deleteAtleta(String nombre){
        deleteParticipante(nombre);
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                "Numero de pruebas: "+numPruebas+"\n"+
                super.toString();
    }
}
