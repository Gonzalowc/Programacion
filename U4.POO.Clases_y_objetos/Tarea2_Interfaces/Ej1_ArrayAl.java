package Tarea2_Interfaces;
import java.util.Arrays;
import java.util.Comparator;

public class Ej1_ArrayAl {
    public static void main(String[] args) {
        Integer[] tabla = new Integer[20];
        introducirNumerosArray(tabla);
        System.out.println(Arrays.toString(tabla));
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
        Arrays.sort(tabla,new DescendenteComparator());
        System.out.println(Arrays.toString(tabla));
    }
    Integer[] tabla;

    public Ej1_ArrayAl() {
        tabla = new Integer[0];
    }

    private static void introducirNumerosArray(Integer[] v){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*(101)+1);
        }
    }
    static class DescendenteComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
