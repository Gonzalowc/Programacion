package T3.Libro2;

import java.util.Arrays;

public class EJ5PRAC {
    public static void main(String[] args) {
        //{5,8,7,1,15,13,12}
        //{1,5,8,7,13,12,15}

        int[] numeros = {5,8,15,7,1,13,12};
        System.out.println("Sin Cambiar"+Arrays.toString(numeros));
        rotarMayorMenor(numeros);
        System.out.println("cambiado MenorMayor"+Arrays.toString(numeros));
        System.out.println(posicionEnArray(numeros,2));
    }

    public static int posicionEnArray(int[] v,int num){
        for (int i = 0; i < v.length; i++) {
            if(v[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void rotarMenor(int[] numeros){
        int min=0,pos,num_Post,num_Ant=0;
        for (int i = 0; i <numeros.length ; i++) {
            if(i==0){
                min=numeros[i];
            }

            if(min>numeros[i]){
                min=numeros[i];
            }
        }

        pos = posicionEnArray(numeros,min);

        for (int i = 0; i <= pos; i++) {
            if(i==0){
                num_Ant = numeros[i];
                numeros[i]=  min;
            }else{
                num_Post = numeros[i];
                numeros[i]=num_Ant;
                num_Ant=num_Post;
            }
        }
    }

    public static void rotarMayor(int[] numeros){
        int max=0,pos,num_Post,num_Ant=0;
        for (int i = 0; i <numeros.length ; i++) {
            if(i==0){
                max=numeros[i];
            }

            if(max<numeros[i]){
                max=numeros[i];
            }
        }

        pos = posicionEnArray(numeros,max);
        for (int i = numeros.length-1; i >= pos; i--) {
            if(i==numeros.length-1){
                num_Ant=numeros[i];
                numeros[i]=max;
            }else{
                num_Post=numeros[i];
                numeros[i]=num_Ant;
                num_Ant=num_Post;
            }
        }
    }

    public static void rotarMayorMenor(int[] numeros){
        rotarMayor(numeros);
        rotarMenor(numeros);
    }
}
