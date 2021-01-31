package Personas;

public class Persona {
    String nombre;
    String apellido;
    byte edad;
    double estatura;
    Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String nombre, String apellido){
        this(nombre);
        this.apellido = apellido;
    }
    Persona(String nombre, String apellido, byte edad, double estatura){
        this(nombre,apellido);
        this.edad = edad;
        this.estatura = estatura;
    }
    public void saludar(){
        System.out.println("Hola! Mi nombre es "+ nombre);
        System.out.println("Encantado de conocerte");
    }
    public void cumplirAnio(){
        edad++;
    }
    public void crecer(double incremento){
        estatura+=incremento;
    }
}
