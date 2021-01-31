package Entregable2021;

import java.util.Calendar;

public class Empleado {
    private String nombreApellidos;
    private String nss;
    private String telefono;
    private String date;
    private TipoEmpleado tipo;
    private static int cantEmpleados=0;

    public Empleado(String nombreApellidos, String nss, String telefono, TipoEmpleado tipo) {
        this.nombreApellidos = nombreApellidos;
        this.nss = nss;
        this.telefono = telefono;
        this.tipo = tipo;
        cantEmpleados++;
        date = getTime();
    }

    private String getTime() {
        Calendar c = Calendar.getInstance();

        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        annio = Integer.toString(c.get(Calendar.YEAR));

        return dia + "/" + mes +"/" + annio;
    }

    public Empleado(String nombreApellidos, String nss, String telefono) {
        this(nombreApellidos,nss,telefono,TipoEmpleado.TECNICO);
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public static int getCantEmpleados(){
        return cantEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado: \n" +
                "Nombre y Apellidos: " + nombreApellidos + "\n" +
                "NSS: " + nss + "\n" +
                "Telefono: " + telefono + "\n" +
                "Date: " + date +"\n"+
                "Tipo: " + tipo+"\n"+"_______________\n";
    }
}
