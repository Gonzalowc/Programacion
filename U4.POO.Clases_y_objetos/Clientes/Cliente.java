package Clientes;

import java.util.*;

public class Cliente implements Comparable<Cliente> {
    public static void main(String[] args) {
        List<Cliente> pipol = Arrays.asList(
         new Cliente("111111111a","Pepe",30,1000),
         new Cliente("222222222a","Pablo",20,2000),
         new Cliente("111111111b","Gonzalo",10,3000)
        );

        System.out.println("//////////////INICIAL////////////////");
        System.out.println(pipol);
        pipol.sort(new dniComparator());
        System.out.println("//////////////DNI////////////////");
        System.out.println(pipol);
        pipol.sort(new nombreComparator());
        System.out.println("//////////////NOMBBRE////////////////");
        System.out.println(pipol);
        pipol.sort(new edadComparator());
        System.out.println("//////////////EDAD////////////////");
        System.out.println(pipol);
        System.out.println("//////////////POR DEFECTO(DNI)////////////////");
        System.out.println(pipol.get(0));
    }
    private String dni;
    private String nombre;
    private int edad;
    private double saldo;

    public Cliente(String dni, String nombre, int edad, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public Cliente(String dni, int edad) {
        this(dni,"",edad,0);
    }

    public Cliente(String dni, int edad, double saldo) {
        this(dni,"",edad,saldo);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "DNI: " + dni + "\n" +
                "Nombre: " + nombre + "\n" +
                "Edad=" + edad +"\n" +
                "Saldo: " + saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return dni.equals(cliente.dni);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo( Cliente cliente2){
        return this.getDni().compareToIgnoreCase(cliente2.getDni());
    }

    static class dniComparator implements Comparator<Cliente>{
        @Override
        public int compare(Cliente cliente1, Cliente cliente2){
            return  cliente1.getDni().compareToIgnoreCase(cliente2.getDni());
        }
    }
    static class nombreComparator implements Comparator<Cliente>{
        @Override
        public int compare(Cliente cliente1, Cliente cliente2){
            return cliente1.getNombre().compareToIgnoreCase(cliente2.getNombre());
        }
    }
    static class edadComparator implements Comparator<Cliente>{
        @Override
        public int compare(Cliente cliente1, Cliente cliente2){
            if(cliente1.getEdad()< cliente2.getEdad()){
                return -1;
            }else if(cliente1.getEdad() > cliente2.getEdad()){
                return 1;
            }
            return 0;
        }
    }
}

