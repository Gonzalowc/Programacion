package T3.Tarea1_Funciones;

import java.util.Scanner;

public class EnClase_FuncionesActividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el radio de la base: ");
        double r = sc.nextDouble();
        System.out.printf("Introduce el radio de la altura: ");
        double h = sc.nextDouble();
        System.out.println("1.- Area\n2.-Volumen");
        int opcion = sc.nextByte();
        if(opcion==1){
            System.out.println("El area de un cilindro con radio de la base "+r+" y altura "+h+" es: "+Volumen(opcion,r,h)+"u2");
        }else if(opcion==2){
            System.out.println("El volumen de un cilindro con radio de la base "+r+" y altura "+h+" es: "+Volumen(opcion,r,h)+"u3");
        }else if(Volumen(opcion,r,h)==-1){
            System.out.println("La opción no es válida");
        }
    }

    public static double Volumen(int opcion, double radio,double altura){
        if(opcion==1){//area
            return (2*Math.PI*radio*(altura+radio));
        }else if(opcion==2){//volumen
            return (Math.PI*Math.pow(radio,2)*altura);
        }else{//opcion no valida
            return -1;
        }
    }
}
