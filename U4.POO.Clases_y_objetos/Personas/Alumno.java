package Personas;

import java.util.Arrays;

public class Alumno {


    String centro="";
    String[] asignaturas = new String[0];
    int[] tiempo;
    //String[] aulas;
    Persona p;

    Alumno(String centro, String[] Asignaturas, Persona persona){
        p = persona;
        this.centro = centro;
        for (int i = 0; i < Asignaturas.length; i++) {
            this.asignaturas = Arrays.copyOf(this.asignaturas, this.asignaturas.length+1);
            this.asignaturas[this.asignaturas.length-1] = Asignaturas[i];
        }
        tiempo = new int[Asignaturas.length];
    }

    public void estudiar(String asignatura, int horas){
        for (int i = 0; i < asignaturas.length; i++) {
            if(asignatura.equals(asignaturas[i])){
                tiempo[i]+=horas;
            }
        }
    }
    public void mostrarInfoAlumno(){
        System.out.println("Nombre: "+ p.nombre);
        System.out.println("Apellidos: "+p.apellido);
        System.out.println("Asignaturas: "+Arrays.toString(this.asignaturas));
        System.out.println("Tiempo para cada asignatura: "+Arrays.toString(this.tiempo));
    }

}
