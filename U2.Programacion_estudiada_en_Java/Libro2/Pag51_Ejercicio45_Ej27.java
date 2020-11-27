package com.Libro2;

import java.util.Scanner;

public class Pag51_Ejercicio45_Ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor, chocolate,nata="", nombre="";
        double precioTarta=0,precioNata=2.5,precioNombre=2.75;
        do{
            System.out.print("Elija un sabor(manzana, fresa o chocolate): ");
             sabor = sc.nextLine();
        }while(!sabor.equals("manzana") && !sabor.equals("fresa") && !sabor.equals("chocolate"));

        switch (sabor){
            case "manzana":
                precioTarta = 18;
                break;
            case "fresa":
                precioTarta = 16;
                break;
            case "chocolate":
                do{
                    System.out.print("¿Qué tipo de chocolate quiere?(negro o blanco): ");
                    chocolate = sc.nextLine();
                }while(!chocolate.equals("negro") && !chocolate.equals("blanco"));
                if(chocolate.equals("negro")){
                    precioTarta = 14;
                }else{
                    precioTarta = 15;

                }
                break;
        }
        do{
            System.out.print("¿Quiere nata?(si o no): ");
            nata = sc.nextLine();
        }while(!nata.equals("si") && !nata.equals("no"));
        if(nata.equals("no")){
            precioNata=0;
        }
        do{
            System.out.print("¿Quiere ponerle nombre?(si o no): ");
            nombre = sc.nextLine();
        }while(!nombre.equals("si") && !nombre.equals("no"));
        if(nombre.equals("no")){
            precioNombre=0;
        }
        System.out.printf("Tarta de "+sabor+": %5.2f€\n",precioTarta);
        if(nata.equals("si")){
            System.out.printf("Con nata: %4.2f€\n",precioNata);
        }
        if(nombre.equals("si")){
            System.out.printf("Con nombre: %4.2f€\n",precioNombre);
        }
        System.out.printf("Total: %5.2f€",(precioTarta+precioNata+precioNombre));
    }
}
