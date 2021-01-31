package Incidencias;

public class Incidencia {
    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
    }
    int codigo;
    Estado estado;
    int puesto;
    String incidencia;
    String resuelto;
    static int genCodigo=1;
    static int pendientes=0;

    public Incidencia(int puesto, String incidencia) {
        this.codigo = genCodigo;
        this.puesto = puesto;
        this.incidencia = incidencia;
        estado = Estado.PENDIENTE;
        resuelto="";
        genCodigo++;
        pendientes++;

    }

    public void resuelve(String resuelve){
        resuelto = resuelve;
        pendientes--;
        estado = Estado.RESUELTA;
    }
    public static int getPendientes(){
        return pendientes;
    }
    @Override
    public String toString() {
        return "Incidencia " + codigo + " - puesto: " + puesto +" - "+incidencia+" - "+estado+
                (estado.equals(Estado.RESUELTA)? " - "+resuelto : "");
    }
}
