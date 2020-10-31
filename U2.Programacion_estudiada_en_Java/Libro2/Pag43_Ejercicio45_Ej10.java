package com.Libro2;

import java.util.Scanner;

public class Pag43_Ejercicio45_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        String mes;
        String[] meses=   {"enero","febrero","marzo","abril",
                        "mayo","junio","julio","agosto","septiembre",
                        "octubre","noviembre","diciembre"
                        };
        int[] dias =    {31,28,31,30,31,30,31,31,30,31,30,31};
        boolean correcto=false;

        do{
            System.out.printf("Introduce dia: ");
            dia = sc.nextInt();
            System.out.printf("Introduce MES: ");
            sc.nextLine();
            mes = sc.nextLine();
            mes = mes.toLowerCase();
            for(int i = 0; i <meses.length; i++) {
                if((meses[i].equals(mes) && (dia>=1 && dia<=dias[i]))){
                    correcto = true;
                    break;
                }
            }
        }while(correcto==false);

        if((dia >=22 && mes.equals(meses[11])) || (dia <=20 && mes.equals(meses[0]))){
            System.out.println("Capricornio");
        }else if((dia >=21 && mes.equals(meses[0])) || (dia <=19 && mes.equals(meses[1]))){
            System.out.println("Acuario");
        }else if((dia >=20 && mes.equals(meses[1])) || (dia <=20 && mes.equals(meses[2]))){
            System.out.println("Piscis");
        }else if((dia >=21 && mes.equals(meses[2])) || (dia <=20 && mes.equals(meses[3]))){
            System.out.println("Aries");
        }else if((dia >=21 && mes.equals(meses[3])) || (dia <=21 && mes.equals(meses[4]))){
            System.out.println("Tauro");
        }else if((dia >=2 && mes.equals(meses[4])) || (dia <=21 && mes.equals(meses[5]))){
            System.out.println("Géminis");
        }else if((dia >=22 && mes.equals(meses[5])) || (dia <=23 && mes.equals(meses[6]))){
            System.out.println("Cáncer");
        }else if((dia >=24 && mes.equals(meses[6])) || (dia <=23 && mes.equals(meses[7]))){
            System.out.println("Leo");
        }else if((dia >=24 && mes.equals(meses[7])) || (dia <=23 && mes.equals(meses[8]))){
            System.out.println("Virgo");
        }else if((dia >=24 && mes.equals(meses[8])) || (dia <=22 && mes.equals(meses[9]))){
            System.out.println("Libra");
        }else if((dia >=24 && mes.equals(meses[9])) || (dia <=22 && mes.equals(meses[10]))){
            System.out.println("Escorpio");
        }else if((dia >=23 && mes.equals(meses[10])) || (dia <=21 && mes.equals(meses[11]))){
            System.out.println("Acuario");
        }else{
            System.out.println("¿No tienes signo del zodíaco?. Vuelve a introducir fecha");
        }
    }
}
