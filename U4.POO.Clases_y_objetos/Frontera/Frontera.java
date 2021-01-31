package Frontera;

import Personas.Persona;

import java.util.Arrays;

public class Frontera {
    private Persona[] p;

    Frontera(){
        p = new Persona[0];
    }

    public void addPersona(String Nombre, String dni){
        p = Arrays.copyOf(p, p.length+1);
        p[p.length-1] = new Persona(Nombre, dni);
    }
}
