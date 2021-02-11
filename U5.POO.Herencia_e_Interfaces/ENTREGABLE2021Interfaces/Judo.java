package ENTREGABLE2021Interfaces;

public class Judo extends Deporte{
    int tatamis;
    public Judo(String nombre, String pabellon, int tatamis) {
        super(nombre, pabellon);
        this.tatamis =tatamis;
    }

    public int getTatamis() {
        return tatamis;
    }

    public void setTatamis(int tatamis) {
        this.tatamis = tatamis;
    }
    public void addJudoka(Judoka judoka){
        addParticipante(judoka);
    }
    public void deleteJudoka(String nombre){
        deleteParticipante(nombre);
    }

    @Override
    public String toString() {
        return "    "+this.getClass().getSimpleName()+"\n"+
                "tatamis: " + tatamis +"\n"+
                super.toString();
    }
}
