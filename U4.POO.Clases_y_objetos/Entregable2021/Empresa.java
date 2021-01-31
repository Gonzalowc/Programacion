package Entregable2021;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] depart;

    public Empresa(String nombre) {
        this.nombre = nombre;
        depart = new Departamento[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDepartamento(Departamento d){
        depart = Arrays.copyOf(depart,depart.length+1);
        depart[depart.length-1] = d;
    }
    public void addDepartamento(String nombre, String sede, String extensionTelefono){
        Departamento d = new Departamento(nombre,sede,extensionTelefono);
        addDepartamento(d);
    }
    public void addDepartamento(String nombre, String extensionTelefono){
        Departamento d = new Departamento(nombre,extensionTelefono);
        addDepartamento(d);
    }
    public void mostrarDatosDepart(){
        System.out.println("Empresa: "+getNombre());
        for (int i = 0; i < depart.length; i++) {
            System.out.println(depart[i]);
        }
    }
    public void borrarDepartamento(String nombre){
        Departamento[] de = new Departamento[0];
        for (int i = 0; i < depart.length; i++) {
            if(!depart[i].getNombre().equals(nombre)){
                de = Arrays.copyOf(de,de.length+1);
                de[de.length-1] = depart[i];
            }
        }
        if(de.length<depart.length){
            depart = de;
        }else{
            System.out.println("No existe el departamento");
        }
    }

    @Override
    public String toString() {
        return "Empresa: "+ nombre;
    }
}
