package EmpresaTransporte;

public class Caja {
    public static void main(String[] args) {
        Caja c = new Caja(5,6,3,Unidades.CM);
        Caja c2 = new Caja(5,6,3,Unidades.CM);
        Destinatario des = new Destinatario("Gonzalillo","la mia casa, 55");
        //c.addDestinatario("Gonzalo Waack","Calle Malaga, 83");
        c2.addDestinatario(des);
        System.out.println(c);
        System.out.println(c2);
    }
    int ancho;
    int alto;
    int fondo;
    Unidades u;
    Destinatario cliente;

    public Caja(int ancho, int alto, int fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
        addDestinatario(new Destinatario("",""));
    }
    public Caja(int ancho, int alto, int fondo, Unidades u, Destinatario cliente) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
        addDestinatario(cliente);
    }

    public void addDestinatario(Destinatario cliente){
        this.cliente = cliente;
    }
    public void addDestinatario(String nombre, String direccion){
        cliente.setDireccion(direccion);
        cliente.setNombreCompleto(nombre);
    }
    public double getVolumen(){
        double cubico;
        if(u.equals(Unidades.M)){
            cubico = alto*ancho*fondo;
        }else{
            cubico = (double)(alto*ancho*fondo)/1000000;
        }
        return cubico;
    }
    public String etiqueta(){
        String etiqueta = "";
        String marcoHor = "";
        if (!cliente.getDireccion().equals("") || !cliente.getNombreCompleto().equals("")) {
            for (int i = 0; i < Math.max(cliente.getDireccion().length(), cliente.getNombreCompleto().length()) + 6; i++) {
                marcoHor += "_";
            }
            etiqueta += marcoHor + "\n\n" + "  " + cliente.getNombreCompleto() + "\n"
                    + "  " + cliente.getDireccion() + "\n\n" + marcoHor;
        } else {
            marcoHor = "_________________________________";
            etiqueta += marcoHor + "\n\n" + "  " + "###Destinatario sin añadir###" + "\n\n" + marcoHor;
        }
        return etiqueta;
    }
    @Override
    public String toString() {

            return "Dimensiones de la caja: \n"+
                    "Altura: " + alto +" "+u+ "\n" +
                    "Anchura: " + ancho +" "+u+ "\n" +
                    "Fondo: " + fondo +" "+u+ "\n" +
                    "Volumen: "+getVolumen()+Unidades.M+"3\n\n"+
                    "Etiqueta:\n" + etiqueta();
    }

}
