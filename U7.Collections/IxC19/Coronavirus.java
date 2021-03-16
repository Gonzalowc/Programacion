package IxC19;

import java.io.*;
import java.util.*;

public class Coronavirus {

    String nombreCientifico;
    String localidadOrigen;
    Map<String,Set<Paciente>> pacientes;

    public Coronavirus(String nombreCientifico, String localidadOrigen) {
        this.nombreCientifico = nombreCientifico;
        this.localidadOrigen = localidadOrigen;
        this.pacientes = new HashMap();
        cargarPacientes();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getLocalidadOrigen() {
        return localidadOrigen;
    }

    public void setLocalidadOrigen(String localidadOrigen) {
        this.localidadOrigen = localidadOrigen;
    }

    public Map<String, Set<Paciente>> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Map<String, Set<Paciente>> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPaciente(String cepa,Paciente paciente){
        if(paciente.getCepa().equals(cepa)){
            if(!pacientes.containsKey(cepa)){
                pacientes.put(cepa,new HashSet<>());
            }
            pacientes.get(cepa).add(paciente);
        }else{
            System.out.println("La cepa no coincide con la del paciente.");
        }
    }
    public void darDeAltaPaciente(Paciente paciente){
        if(pacientes.get(paciente.getCepa()).contains(paciente)){
            pacientes.get(paciente.getCepa()).remove(paciente);
        }else{
            System.out.println("Paciente no encontrado");
        }
    }
    public int pacientesDeUnDoctor(String numColegiado){
        Medico m = new Medico("","",numColegiado,"");
        Collection<Set<Paciente>> aux = pacientes.values();
        int cantPacientes=0;
        Iterator it = aux.iterator();
        while(it.hasNext()){
            ArrayList<Paciente> aux2 = new ArrayList((Set<Paciente>) it.next());
            for(Paciente p : aux2){
                if(p.getMedico().equals(m)){
                  cantPacientes++;
                    System.out.println(p);
                }
            }
        }
        if(cantPacientes==0){
            System.out.println("Este médico/a no lleva ningún paciente");
        }
        return cantPacientes;
    }
    public void pacientesPorPeso(String cepa){
        if(pacientes.containsKey(cepa)){
            List<Paciente> aux = new ArrayList<>( pacientes.get(cepa));
            aux.sort(new Comparator<Paciente>() {
                @Override
                public int compare(Paciente o1, Paciente o2) {
                    return (int) (o2.getPeso()-o1.getPeso());
                }
            });
            System.out.println(aux);
        }else{
            System.out.println("No se reconoce la cepa");
        }
    }
    public void pacientesPorEdad(String cepa){
        if(pacientes.containsKey(cepa)){
            ArrayList<Paciente> aux = new ArrayList<>(pacientes.get(cepa));
            aux.sort(new Comparator<Paciente>() {
                @Override
                public int compare(Paciente o1, Paciente o2) {
                    return o2.getEdad()-o1.getEdad();
                }
            });
            System.out.println(aux);
        }else{
            System.out.println("No se reconoce la cepa");
        }
    }
    public void cargarPacientes(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("src/IxC19/pacientes.dat"));
            while (true){
                Paciente p = (Paciente) leer.readObject();
                addPaciente(p.getCepa(),p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Datos cargados");
        }
    }
    public void guardarPacientes(){
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("src/IxC19/pacientes.dat"));

            Collection<Set<Paciente>> aux = pacientes.values();

            Iterator it = aux.iterator();
            while (it.hasNext()){
                ArrayList<Paciente> aux2 = new ArrayList((Set<Paciente>) it.next());
                for(Paciente p : aux2){
                    escribir.writeObject(p);
                }
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println("Datos guardados");
        }
    }

    @Override
    public String toString() {
        return "Coronavirus: \n" +
                "Nombre Cientifico: " + nombreCientifico +"\n" +
                "Localidad Origen: " + localidadOrigen + "\n" +
                "Pacientes:\n" + pacientes;
    }
}
