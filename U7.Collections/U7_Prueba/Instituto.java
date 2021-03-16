package U7_Examen;

import java.io.*;
import java.util.*;

public class Instituto {

    private String nombre;
    private Map<String,ArrayList<Alumno>> unidades;

    public Instituto(String nombre) {
        unidades = new TreeMap<>();
        this.nombre = nombre;
        cargarAlumnos();
    }

    public void addAlumnoUnidad(Alumno alumno, String nombreUnidad){
        if(alumno.getUnidad().equals(nombreUnidad)){
            if(!unidades.containsKey(nombreUnidad)){
                unidades.put(nombreUnidad,new ArrayList());
            }
            if(!unidades.get(nombreUnidad).contains(alumno)){
                unidades.get(nombreUnidad).add(alumno);
            }else{
                System.out.println("El alumno ya estaba registrado");
            }
        }else{
            System.out.println("El alumno no está inscrito en esta Unidad");
        }
    }
    public String obtenerUnidadAlumno(String idAlumno){
        List<String> unid = new ArrayList<>(unidades.keySet());
        Alumno aux = new Alumno("","","","");
        aux.setId(idAlumno);
        for (int i = 0; i < unid.size(); i++) {
            if(unidades.get(unid.get(i)).contains(aux)){
                return unidades.get(unid.get(i)).get( unidades.get(unid.get(i)).indexOf(aux)).getUnidad();
            }
        }
        return "No se encuentra el id: "+idAlumno;
    }

    public void mostrarAlumnosUnidad(String nombreUnidad){
        if(unidades.containsKey(nombreUnidad)){
            unidades.get(nombreUnidad).sort((o1, o2) -> o1.getDni().compareToIgnoreCase(o2.getDni()));
            System.out.println(unidades.get(nombreUnidad));
        }else{
            System.out.println("La unidad no se ha iniciado");
        }
    }
    public void mostrarTodosAlumnosOrdenados(){
        List<String> unid = new ArrayList<>(unidades.keySet());
        List<Alumno> alums = new ArrayList<>();
        for (int i = 0; i < unidades.size(); i++) {
            alums.addAll(unidades.get(unid.get(i)));
        }
        Collections.sort(alums, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
            }
        });
        System.out.println(alums);
    }
    public void cargarAlumnos(){
        ObjectInputStream leer=null;
        try{
            leer = new ObjectInputStream(new FileInputStream("alumnos.dat"));
            while(true){
                Alumno aux = (Alumno) leer.readObject();
                if(aux!=null){
                    addAlumnoUnidad(aux,aux.getUnidad());
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Datos Cargados.");
        }
    }
    public void guardarAlumnos(){
        List<String> unid = new ArrayList<>(unidades.keySet());
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            for (int i = 0; i < unid.size(); i++) {
                for (int j = 0; j < unidades.get(unid.get(i)).size(); j++) {
                    escribir.writeObject(unidades.get(unid.get(i)).get(j));
                }
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println("Datos Guardados.");
        }
    }



    @Override
    public String toString() {
        return "Instituto " + nombre + "\n" +
                " Unidades: \n" + unidades;
    }
}
