package com.Libro2;

import java.util.Scanner;

public class Pag52_Ejercicio45_Ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String comer, beber, pitufo;
        double comida=0, bebida=0;

        do{
            System.out.print("¿Qué ha tomado de comer?(palmera, donut, pitufo): ");
            comer = sc.nextLine();
        }while(!comer.equals("palmera") &&!comer.equals("donut") &&!comer.equals("pitufo"));
        switch (comer){
            case "palmera": comida=1.4;break;
            case "donut": comida=1;break;
            case "pitufo":
                do{
                    System.out.print("¿Con qué ha tomado el pitufo? (aceite o tortilla): ");
                    pitufo= sc.nextLine();
                }while(!pitufo.equals("aceite") && !pitufo.equals("tortilla"));
                comer = comer+" con "+pitufo;
                if(pitufo.equals("aceite")){
                    comida=1.2;
                }else{
                    comida=1.6;
                }
                break;
        }
        do{
            System.out.print("¿Qué ha tomado de beber?(zumo o cafe): ");
            beber = sc.nextLine();
        }while(!beber.equals("zumo") && !beber.equals("cafe"));
        if(beber.equals("zumo")){
            bebida=1.5;
        }else{
            bebida=1.2;
        }
        System.out.printf(comer+": %4.2f €\n",comida);
        System.out.printf("%4s: %4.2f €\n",beber,bebida);
        System.out.printf("Total desayuno: %4.2f €",(bebida+comida));
    }
}
