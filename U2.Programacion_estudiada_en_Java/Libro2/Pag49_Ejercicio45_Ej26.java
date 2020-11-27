package com.Libro2;

import java.util.Scanner;

public class Pag49_Ejercicio45_Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioEntradax1=0,precioEntradax2=0,Ptarjeta=0,descuento=0,total=0;
        int dobles=0, individuales=0;

        System.out.println("Venta de entradas CineCampa");
        System.out.printf("Número de entradas: ");
        int entradas = sc.nextInt();
        System.out.printf("Día de la semana: ");
        sc.nextLine();
        String dia = sc.nextLine().toLowerCase();
        System.out.printf("¿Tiene tarjeta CineCampa?(s/n): ");
        String tarjeta = sc.nextLine().toLowerCase();
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

        switch (dia){
            case "lunes":
                precioEntradax1 = 8;
                individuales=entradas;
                break;
            case "martes":
                precioEntradax1 = 8;
                individuales=entradas;
                break;
            case "miercoles":
                precioEntradax1 = 5;
                individuales=entradas;
                break;
            case "jueves":
                precioEntradax1=8;
                precioEntradax2=11;
                dobles=(int)Math.floor(entradas/2);
                if(entradas%2==1){
                    individuales = 1;
                }
                break;
            case "viernes":
                precioEntradax1 = 8;
                individuales=entradas;
                break;
            case "sabado":
                precioEntradax1 = 8;
                individuales=entradas;
                break;
            case "domingo":
                precioEntradax1 = 8;
                individuales=entradas;
                break;
            default:
                System.out.println("Introduce un dia de la semana válido(lunes - domingo");
        }
        switch (tarjeta){
            case "s":
                Ptarjeta=10;
                break;
            case "n":
                Ptarjeta=0;
                break;
            default:
                System.out.println("Introduce una respuesta válida(s/n)");
        }

            total = individuales*precioEntradax1+(dobles*precioEntradax2);
            descuento = total*(Ptarjeta/100);

        if(dia.equals("jueves")){
            System.out.printf("%-30s %6dU\n","Entradas de pareja",dobles);
            System.out.printf("%-30s %6.2f€\n","Precio por entrada de pareja",precioEntradax2);
            if(entradas%2==1){
                System.out.printf("%-30s %6dU\n","Entradas individuales ",individuales);
                System.out.printf("%-30s %6.2f€\n","Precio por entrada individual ",precioEntradax1);
            }
        }else{
            System.out.printf("%-30s %6dU\n","Entradas individuales ",individuales);
            System.out.printf("%-30s %6.2f€\n","Precio por entrada individual ",precioEntradax1);
        }
        System.out.printf("%-30s %6.2f€\n","Total ",(double)total);
        System.out.printf("%-30s %6.2f€\n","Descuento", descuento);
        System.out.printf("%-30s %6.2f€\n","A pagar",(total-descuento));
    }
}