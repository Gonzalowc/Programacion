package WaackCarneadoGonzaloE5Examen;

import java.util.Arrays;
import java.util.Objects;

public class Caja {
    private int idCaja;
    private Prenda[] prendas;
    private int prendasMax;
    private static int genIDCaja=0;
    private double pesoCaja;

    public Caja() {
        this.prendas = new Prenda[0];
        prendasMax=5;
        idCaja = genIDCaja;
        genIDCaja++;
        pesoCaja=0;
    }

    public double getPesoCaja() {
        return pesoCaja;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }

    public boolean addPrenda(Prenda prenda){
        if(!(prenda instanceof PrendaColgada)){
            if(prendas.length<prendasMax){
                prendas = Arrays.copyOf(prendas,prendas.length+1);
                prendas[prendas.length-1] = prenda;
                pesoCaja+=prenda.getPeso();
                return true;
            }else{
                System.out.println("No se puede meter mas ropa en esta caja.");
                return false;
            }
        }else{
            System.out.println("Esta prenda no va en esta caja. Va colgada");
            return false;
        }
    }
    public void deletePrenda(Prenda prenda){
        Prenda[] aux = new Prenda[0];
        for (int i = 0; i < prendas.length; i++) {
            if(!prenda.equals(prendas[i])){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = prendas[i];
                pesoCaja-=prenda.getPeso();
            }
        }
        prendas=aux;
    }
    public void deletePrenda(String codigoBarra){
        Prenda[] aux = new Prenda[0];
        for (int i = 0; i < prendas.length; i++) {
            if(!codigoBarra.equals(prendas[i].getCodigoBarras())){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1] = prendas[i];
                pesoCaja-=prendas[i].getPeso();
            }
        }
        if(aux.length==prendas.length){
            System.out.println("Codigo de barras no encontrado");
        }
        prendas=aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caja)) return false;
        Caja caja = (Caja) o;
        return idCaja == caja.idCaja;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCaja);
    }

    @Override
    public String toString() {
        String p = "";
        for (int i = 0; i < prendas.length; i++) {
            p+=prendas[i]+"\n";
        }
        return "Caja: " +idCaja+"\n"+
                "Prendas Maximas: " + prendasMax +"\n"+
                "Peso de la Caja: " + pesoCaja +"\n"+
                "   Prendas:\n " + p;
    }
}
