package PoligonosRegulares;

import Clientes.Cliente;

import java.util.Arrays;
import java.util.List;

import static PoligonosRegulares.PoligonoRegular.getContadorPoligonos;

public class Main {
    public static void main(String[] args) {
        List<PoligonoRegular> poligonos = Arrays.asList(
          new Cuadrado(10,Color.ROJO),
          new Cuadrado(15,Color.AMARILLO),
          new Triangulo(35,20,Color.VERDE),
          new Triangulo(35.0),
                new Triangulo()
        );
        System.out.println("/////////////////SIN ORDEN//////////////");
        for (int i = 0; i < poligonos.size(); i++) {
            System.out.print(poligonos.get(i));
        }
        System.out.println("/////////////////////////////////////");
        System.out.println("Poligonos creados: "+getContadorPoligonos());
        System.out.println("//////////////ORDEN DEFECTO///////////////////");
        List<Triangulo> triangulos = Arrays.asList(
                new Triangulo(35,20,Color.VERDE),
                new Triangulo(35.0),
                new Triangulo(),
                new Triangulo(Color.AMARILLO),
                new Triangulo(20,20)
        );
        triangulos.sort(new Triangulo.ladoComparator());
        for (int i = 0; i < triangulos.size(); i++) {
            System.out.print(triangulos.get(i));
        }
        System.out.println("/////////////////ORDEN COLOR//////////////");
        triangulos.sort(new Triangulo.ColorAlfComparator());
        for (int i = 0; i < triangulos.size(); i++) {
            System.out.print(triangulos.get(i));
        }
    }
}
