package Texto;

public class Main {
    public static void main(String[] args) {
        Texto t = new Texto(10);

        t.insertarFinalCadena("Hola");
        t.insertarPrincipio('-');
        t.insertarPrincioCadena("Adios");
        t.mostrarCadena();
        System.out.println(t.CantidadVocales());
    }
}
