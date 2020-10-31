package com.Libro2;

import java.util.Scanner;

public class Ejercicio45_Ej16_Pag45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int varemo=0;
        boolean correcta=false;
        String respuesta="";
        System.out.println("Contesta estas 10 preguntas. Y comprueba la probabilidad de que sea o no infiel: ");

        for (int i = 1; i <=10 ; i++) {
            switch (i){
                case 1:
                    System.out.printf(i+". Tu pareja parece estar más inqieta de lo normal sin ningún motivo aparente(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 2:
                    System.out.printf(i+". Ha aumentado sus gastos de vestuario(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 3:
                    System.out.printf(i+". Ha perdido el interés que mostraba anteriormente por ti(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 4:
                    System.out.printf(i+". Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se" +
                            "arregla el pelo y se asea con más frecuencia (si es mujer)(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 5:
                    System.out.printf(i+". No te deja que mires la agenda de su teléfono móvil(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 6:
                    System.out.printf(i+". A veces tiene llamadas que dice no querer contestar cuando estás tú delante(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 7:
                    System.out.printf(i+". Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 8:
                    System.out.printf(i+". Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 9:
                    System.out.printf(i+". Has notado que últimamente se perfuma más(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
                case 10:
                    System.out.printf(i+". Se confunde y te dice que ha estado en sitios donde no ha ido contigo(verdadero/falso): ");
                    respuesta = sc.nextLine();
                    break;
            }
            if(respuesta.equalsIgnoreCase("verdadero") || respuesta.equalsIgnoreCase("falso")){
                if(respuesta.equalsIgnoreCase("verdadero")){
                    correcta=true;
                }else{
                    correcta=false;
                }
                if(correcta==true){
                    varemo+=3;
                }
            }else{
                i--;
            }
        }
        System.out.println("");
        if(varemo>=0 && varemo<=10){
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel"+"("+varemo+"/10)");

        } else if(varemo>10 && varemo<=22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\n" +
                    "aunque seguramente será algo sin importancia. No bajes la guardia."+"("+varemo+"/22)");
        }else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.\n" +
                    "Te aconsejamos que indagues un poco más y avergües que es lo que está pasando por su cabeza.("+varemo+"/30)");
        }
    }
}
