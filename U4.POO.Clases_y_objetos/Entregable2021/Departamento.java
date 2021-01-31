package Entregable2021;

import java.util.Arrays;

public class Departamento {
    private String nombre;
    private String sede;
    private String extensionTelefono;
    private Empleado[] empleados;
    private static int cantDepart=0;

    public Departamento(String nombre, String sede, String extensionTelefono) {
        this.nombre = nombre;
        this.sede = sede;
        this.extensionTelefono = extensionTelefono;
        empleados = new Empleado[0];
        cantDepart++;
    }

    public Departamento(String nombre, String extensionTelefono) {
        this(nombre,"Castilleja",extensionTelefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getExtensionTelefono() {
        return extensionTelefono;
    }

    public void setExtensionTelefono(String extensionTelefono) {
        this.extensionTelefono = extensionTelefono;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado e){
        empleados = Arrays.copyOf(empleados, empleados.length+1);
        empleados[empleados.length-1] = e;
    }
    public void addEmpleado(String nombreApellidos, String nss, String telefono, TipoEmpleado tipo){
        Empleado e = new Empleado(nombreApellidos,nss,telefono,tipo);
        addEmpleado(e);
    }
    public void addEmpleado(String nombreApellidos, String nss, String telefono){
        Empleado e = new Empleado(nombreApellidos,nss,telefono);
        addEmpleado(e);
    }

    public void borrarEmpleado(String nss){
        Empleado[] e = new Empleado[0];
        for (int i = 0; i < empleados.length; i++) {
            if(!empleados[i].getNss().equals(nss)){
                e = Arrays.copyOf(e,e.length+1);
                e[e.length-1] = empleados[i];
            }
        }
        if(e.length<empleados.length){
            empleados = e;
        }else{
            System.out.println("No se ha encontrado el Empleado con NSS: "+nss);
        }
    }
    public static int getCantDepart(){
        return cantDepart;
    }
    public void mostrarListaEmpleados(){
        System.out.println("Departamento: "+getNombre());
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
        }
    }


    @Override
    public String toString() {
        return "Departamento " + nombre + ": \n" +
                " Sede: " + sede +"\n"+
                " Extension de Telefono: " + extensionTelefono+"\n";
    }
}
