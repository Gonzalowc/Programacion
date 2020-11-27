package com.Libro2;

import java.util.Scanner;

public class Pag47_Ejercicio45_Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaNum=0;
        System.out.printf("Introduce un dia de la semana(lunes-viernes): ");
        String dia = sc.nextLine();
        System.out.printf("Introduce la hora del día: ");
        int hora = sc.nextInt();
        System.out.printf("Introduce los minutos de la hora introducida: ");
        int minutos = sc.nextInt();

        System.out.print("Desde el"+dia.toUpperCase()+" con hora "+hora+":"+minutos+" hay ");
        dia = dia.toLowerCase();
        switch (dia){
            case "lunes": diaNum=1; break;
            case "martes": diaNum=2; break;
            case "miercoles": diaNum=3; break;
            case "jueves": diaNum=4; break;
            case "viernes": diaNum=5; break;
        }

        if(diaNum>0){
            diaNum=5-diaNum;//dias que hay hasta el viernes

            if(diaNum==0){
                hora = 15-hora;
            }else{
                diaNum=(diaNum-1)*24;
                hora = 24-hora;
                hora = hora+15;
            }
            System.out.println("DIANUM "+diaNum+" HORA "+hora+" minutos "+minutos);

            hora = (diaNum*60)+(hora*60)-minutos;
        }
        System.out.print(hora+" minutos");
    }
}
