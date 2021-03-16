package maraton;

import java.io.*;
import java.util.*;

/**
 * Clase Maraton de Castilleja de la Cuesta.
 */
public class Maraton {
    /**
     * Mapa que guarda el dorsal con su Atleta correspondiente.
     */
    private Map<String,Atleta> atletas;

    /**
     * Constructor de la clase, inicializa la estructura de datos.
     */
    public Maraton() {
        atletas = new HashMap<>();
    }

    /**
     * Getter mapa de atletas
     * @return mapa con todos los dorsales y sus Atletas.
     */
    public Map<String, Atleta> getAtletas() {
        return atletas;
    }

    /**
     * Setter del mapa.
     * @param atletas mapa.
     */
    public void setAtletas(Map<String, Atleta> atletas) {
        this.atletas = atletas;
    }

    /**
     * Inscribe a un participante en la competición.
     * @param nombre Nombre del atleta.
     * @param pais Pais del atleta.
     * @param categoria Categoria del atleta.<br>
     *                  <ul>
     *                      <li>Junior</li>
     *                      <li>Senior</li>
     *                      <li>Veterano</li>
     *                  </ul>
     */
    public void inscribirAtleta(String nombre, String pais, Categoria categoria){
        Atleta aux = new Atleta(nombre,pais,categoria);
        atletas.put(aux.getDorsal(),aux);
    }

    /**
     * Guarda el tiempo de un atleta en segundos. Marca al atleta como finisher.
     * @param dorsal Dorsal perteneciente a un atleta. En caso de no encontrarlo muestra un mensaje.
     * @param marcaTiempo Tiempo en el que ha realizado el atleta la prueba.
     */
    public void guardarTiempo(String dorsal,int marcaTiempo){
        if(atletas.containsKey(dorsal)){
            if(marcaTiempo>=0){
                atletas.get(dorsal).setSegundos(marcaTiempo);
                atletas.get(dorsal).setFinisher(true);
            }else{
                System.out.println("El tiempo no puede ser menor que 0");
            }
        }else{
            System.out.println("El Atleta no se encuentra");
        }
    }

    /**
     * Borra un atleta de la competicion.
     * @param dorsal Dorsal perteneciente a un atleta. En el caso de no encontrarlo, muestra un mensaje.
     */
    public void borrarAtleta(String dorsal){
        if(atletas.containsKey(dorsal)){
            atletas.remove(dorsal);
        }else{
            System.out.println("El atleta no está inscrito");
        }
    }

    /**
     * Muestra un listado de todos los atletas que han registrado un tiempo. Están ordenados por su marca ascendente.
     * En caso de no tener atletas con una marca de tiempo, muestra un mensaje.
     */
    public void mostrarListaFinishers(){
        Collection<Atleta> atle = atletas.values();
        LinkedList<Atleta> finishers = new LinkedList<>();
        Iterator it = atle.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if(a.isFinisher()){
                finishers.add(a);
            }
        }
        if(finishers.isEmpty()){
            System.out.println("No hay atletas con marcas de tiempo");
        }else{
            Collections.sort(finishers);
            System.out.println(finishers);
        }
    }

    /**
     * Muestra todos los atletas de una determinada categoría ordenada por tiempos.
     * @param categoria Categoria de la maraton. En caso de no tener atletas en esta categoría, muestra un mensaje.
     */
    public void mostrarListaCategoria(Categoria categoria){
        Collection<Atleta> atle = atletas.values();
        LinkedList<Atleta> cat = new LinkedList<>();

        Iterator it = atle.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if(a.getCategoria().equals(categoria)){
                cat.add(a);
            }
        }
        Collections.sort(cat);
        if(cat.isEmpty()){
            System.out.println("No hay atletas inscritos en esta categoria");
        }else{
            System.out.println(cat);
        }
    }

    /**
     * Muesta una cantidad de atletas de un pais inscrito en la maraton sin depender de su categoría.
     * @param pais pais que queremos saber la cantidad de atletas.
     * @return cantidad de atletas pertenecientes a dicho pais.
     */
    public int participantesPorPais(String pais){
        Collection<Atleta> atle = atletas.values();
        int cantPorPais=0;
        Iterator it = atle.iterator();
        while (it.hasNext()){
            Atleta a = (Atleta) it.next();
            if(a.getPais().equals(pais)){
                cantPorPais++;
            }
        }
        return cantPorPais;
    }

    /**
     * Carga los atletas en el mapa.
     */
    public void cargarAtletas(){
        try{
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("src/maraton/maraton.dat"));
            while (true){
                Atleta a = (Atleta) leer.readObject();
                atletas.put(a.getDorsal(),a);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Atletas cargados");
        }
    }

    /**
     * Guarda los atletas en el fichero binario.
     */
    public void guardarAtletas(){
        Collection<Atleta> atl = atletas.values();
        try{
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("src/maraton/maraton.dat"));
            Iterator it = atl.iterator();
            while (it.hasNext()){
                Atleta a = (Atleta) it.next();
                escribir.writeObject(a);
            }
            escribir.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Datos guardados");
    }

    /**
     * Menu para utilizar todas las funciones anteriores, solicitando los datos necesarios para su utilización.
     */
    public void MaratonMenu(){
        Scanner sc = new Scanner(System.in);

        while (true){
            mostrarMenu();
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    cargarAtletas();
                    break;
                case 2: guardarAtletas();
                    break;
                case 3:
                    System.out.println("Introduce nombre del atleta: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Introduce pais del atleta: ");
                    String pais = sc.nextLine();

                    String cat;
                    Categoria categoria;
                    do{
                        System.out.println("Introduce categoria del atleta(SENIOR/JUNIOR/VETERANO): ");
                        cat = sc.nextLine();

                    }while(!cat.equalsIgnoreCase("senior") && !cat.equalsIgnoreCase("junior") && !cat.equalsIgnoreCase("veterano"));
                    if(cat.equalsIgnoreCase("junior")){
                        categoria = Categoria.JUNIOR;
                    }else if(cat.equalsIgnoreCase("senior")){
                        categoria = Categoria.SENIOR;
                    }else {
                        categoria = Categoria.VETERANO;
                    }
                    inscribirAtleta(nombre,pais,categoria);
                    break;
                case 4:
                    System.out.println("Introduce el dorsal:");
                    sc.nextLine();
                    String dorsal = sc.nextLine();
                    System.out.println("Introduce el tiempo del dorsal "+dorsal);
                    int tiempo=sc.nextInt();
                    guardarTiempo(dorsal,tiempo);
                    break;
                case 5:
                    System.out.println("Introduce el dorsal del atleta: ");
                    sc.nextLine();
                    dorsal = sc.nextLine();
                    borrarAtleta(dorsal);
                    break;
                case 6:
                    System.out.println("Lista de FINISHERS");
                    mostrarListaFinishers();
                    break;
                case 7:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce la categoria que busca(SENIOR/JUNIOR/VETERANO): ");
                        cat = sc.nextLine();
                    }while(!cat.equalsIgnoreCase("senior") && !cat.equalsIgnoreCase("junior") && !cat.equalsIgnoreCase("veterano"));
                    if(cat.equalsIgnoreCase("junior")){
                        categoria = Categoria.JUNIOR;
                    }else if(cat.equalsIgnoreCase("senior")){
                        categoria = Categoria.SENIOR;
                    }else {
                        categoria = Categoria.VETERANO;
                    }
                    System.out.println("Lista de categoría");
                    mostrarListaCategoria(categoria);
                    break;
                case 8:
                    System.out.println("Introduce el pais que quiere consultar: ");
                    sc.nextLine();
                    pais = sc.nextLine();
                    System.out.println("Atletas del pais "+ pais+": "+participantesPorPais(pais));
                    break;
                case 9: break;
                default:
                    System.out.println("Introduce un numero perteneciente al menú");

            }
            if (opcion==9){
                break;
            }
        }


    }

    /**
     * Menu para mostrar en el el programa de la Maratón.
     */
    private void mostrarMenu(){
        System.out.println("1.-Cargar Atletas.");
        System.out.println("2.-Guardar Atletas.");
        System.out.println("3.-Inscribir Atletas.");
        System.out.println("4.-Guardar Tiempo.");
        System.out.println("5.-Borrar Atleta.");
        System.out.println("6.-Mostrar Lista Finishers.");
        System.out.println("7.-Mostrar Lista Categoria.");
        System.out.println("8.-Mostrar Cantidad por Pais.");
        System.out.println("9.-Salir.");
    }

    /**
     * toString de la clase. Muestra de tal forma:
     *
     * @return
     * Maraton Castilleja de la Cuesta
     *  atletas:
     *  Atleta:
     *   Nombre: nombre
     *   Pais: pais
     *   Segundos: segundos
     *   Categoria: categoria
     *   Finisher: Pruebas Acabadas / Quedan pruebas
     *   Dorsal: dorsal
     */
    @Override
    public String toString() {
        return "Maraton Castilleja de la Cuesta\n" +
                "atletas: \n" + atletas;
    }
}
