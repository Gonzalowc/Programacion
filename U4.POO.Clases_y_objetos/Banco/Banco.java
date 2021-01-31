package Banco;

public class Banco {
    final private String nombre;
    double capital = 5.2;
    String direccion;
    public Banco(String nombre){
        this.nombre = nombre;
        this.direccion ="";
    }
    Banco(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Banco(String nombre, double capital, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.capital = capital;
    }
    public void cambiarDireccion(String direccion){
        this.direccion = direccion;
    }
    public void  cambiarCapital(double capital){
        this.capital = capital;
    }
    public void mostrarInfo(){
        System.out.println("Banco: "+nombre);
        System.out.println("Capital: "+capital+" Millones de €");
        System.out.println("Dirección: "+direccion);
    }

}
