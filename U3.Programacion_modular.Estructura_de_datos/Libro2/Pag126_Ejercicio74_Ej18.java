package T3.Libro2;

import java.util.Arrays;

public class Pag126_Ejercicio74_Ej18 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*201);
        }
        System.out.println(Arrays.toString(numeros));
        menor100mayor(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static void menor100mayor(int[] v){
        int[] menor = new int[0];
        int[] mayor = new int[0];

        for (int i = 0; i < v.length; i++) {
            if(menor100(v[i])){
                menor = Arrays.copyOf(menor, menor.length+1);
                menor[menor.length-1] = v[i];
            }else{
                mayor = Arrays.copyOf(mayor, mayor.length+1);
                mayor[mayor.length-1] = v[i];
            }
        }
        //System.out.println("Menor"+Arrays.toString(menor));
        //System.out.println("Mayor"+Arrays.toString(mayor));
        int contmenor=0, contmayor=0;
        for (int i = 0; i < v.length; i++) {
            if(contmenor<menor.length && contmayor<mayor.length){
                if(i%2==0){
                    v[i]=menor[contmenor];
                    contmenor++;
                }else{
                    v[i]=mayor[contmayor];
                    contmayor++;
                }
            }else if(contmenor<menor.length){
                v[i]=menor[contmenor];
                contmenor++;
            }else if(contmayor<mayor.length){
                v[i]=mayor[contmayor];
                contmayor++;
            }
        }
    }

    public static boolean menor100(int num){
        if (num<=100){
            return true;
        }else{
            return false;
        }
    }
}
