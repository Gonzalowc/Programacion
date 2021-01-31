package Libro2.Moviles;

public enum Tarifas {
    RATA(6), MONO(12), BISONTE(30);
    int precio;
    Tarifas(int precio) {
        this.precio = precio;
    }
}
