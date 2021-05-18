package dom;

import java.util.Scanner;

public class Main__ModificacionDOm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModificacionDOM d = new ModificacionDOM();
        System.out.println("Cuantos libros quiere añadir?");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            d.addLibro();
        }
        d.addPaisAutor();
        d.guardarDOMFichero();

    }
}
