package com.Tarea8_Bucles;


public class Ejercicio8_7 {
    public static void main(String[] args) {
        int i=0, cont=0, impar=1;

        while(cont<10){
            if(i%2==1){
                cont++;
                impar = impar*i;
            }
            i++;
        }
        System.out.println(impar);
    }
}
