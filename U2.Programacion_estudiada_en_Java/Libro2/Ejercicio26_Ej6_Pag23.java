package com.Libro2;

public class Ejercicio26_Ej6_Pag23 {
    public static void main(String[] args) {
        double baseI=300, IVA=0.21;
        System.out.println("El total de la factura a partir de la base imponible de "+baseI+"€ con IVA de "+(int)(IVA*100)+"% es de "+(baseI+(baseI*IVA))+"€");
    }
}
