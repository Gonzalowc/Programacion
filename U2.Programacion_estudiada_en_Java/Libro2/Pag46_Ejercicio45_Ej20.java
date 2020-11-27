package com.Libro2;

import java.util.Scanner;

public class Pag46_Ejercicio45_Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long capicua=0, cifra, num2;
        System.out.print("Introduce un numero: ");
        long numero = sc.nextInt();
        num2=numero;
        while(numero!=0){
            cifra = numero%10;
            capicua = capicua*10+cifra;
            numero = (long)Math.floor(numero/10);
        }
        if(num2 == capicua){
            System.out.println("El numero "+num2+" es capicua");
        }else{
            System.out.println("El numero "+num2+" no es capicua");
        }
    }
}
