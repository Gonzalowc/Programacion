package maraton;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase Atleta
 */
public class Atleta implements Serializable,Comparable<Atleta> {
    /**
     * Nombre del atleta.
     */
    private String nombre;
    /**
     * Pais del atleta.
     */
    private String pais;
    /**
     * Segundos de la prueba
     */
    private int segundos;
    /**
     * Categoria inscrito el atleta.
     */
    private Categoria categoria;
    /**
     * Si ha finalizado la prueba.
     */
    private boolean finisher;
    /**
     * Dorsal del atleta.
     */
    private String dorsal;
    /**
     * Generador de dorsales.
     */
    private static int genDorsal=0;

    /**
     * Constructor de la clase Atleta.
     * @param nombre Nombre del Atleta.
     * @param pais Pais del Atleta.
     * @param categoria Categoria del atleta(Junior,Senior,Veterano)
     */
    public Atleta(String nombre, String pais, Categoria categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        segundos=0;
        this.dorsal = Integer.toString(genDorsal);
        genDorsal++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * Equals de atleta, Un atleta es igual a otro si tienen el mismo dorsal.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atleta)) return false;
        Atleta atleta = (Atleta) o;
        return dorsal.equals(atleta.dorsal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dorsal);
    }

    /**
     * toString de atleta.
     * @return
     *   Atleta:
     *    Nombre: nombre
     *    Pais: pais
     *    Segundos: segundos
     *    Categoria: categoria
     *    Finisher: Pruebas Acabadas / Quedan pruebas
     *    Dorsal: dorsal
     */
    @Override
    public String toString() {
        return "Atleta: \n" +
                "Nombre: " + nombre + "\n"+
                "Pais: " + pais + "\n"+
                "Segundos: " + segundos +"\n"+
                "Categoria: " + categoria +"\n"+
                "Finisher: " + (finisher?"Pruebas Acabadas":"Quedan pruebas") +"\n"+
                "Dorsal: " + dorsal;
    }

    /**
     * Comparable por la marca en segundos del atleta.
     * @param o otro atleta a comparar.
     * @return <ul>
     *          <li>-1 si el atleta pasado por parametro es mayor que el mismo.</li>
     *          <li>0 si son iguales</li>
     *          <li>1 si el atleta pasado por marametro es menor que el mismo.</li>
     *         </ul>
     */
    @Override
    public int compareTo(Atleta o) {
        return this.segundos-o.segundos;
    }
}
