package Libro2.ExpocochesCampanillas;

import java.util.Arrays;
import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {
        VentaEntradas Expocoches = new VentaEntradas();
        Expocoches.addZona("Principal",1000);
        Expocoches.addZona("Compra-Venta",200);
        Expocoches.addZona("Vip",25);
        Expocoches.ProgramaVenta();
    }
    private Zona[] zonas;

    public VentaEntradas() {
        zonas = new Zona[0];
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

    public void addZona(String nombreZona, int entradasParaVenta){
        zonas = Arrays.copyOf(zonas, zonas.length+1);
        zonas[zonas.length-1] = new Zona(nombreZona, entradasParaVenta);
    }
    private boolean existeZona( String nombreZona){
        for (int i = 0; i < zonas.length; i++) {
            if(zonas[i].getNombre().equals(nombreZona)){
                return true;
            }
        }
        return false;
    }
    public void vender(String zona, int cantidad){
        for (int i = 0; i < zonas.length; i++) {
            if(zonas[i].getNombre().equals(zona)){
                zonas[i].venderEntrada(cantidad);
            }
        }
    }
    public void entradasPorVender(){
        for (int i = 0; i < zonas.length; i++) {
            if(zonas[i].getEntradasDisponibles()!=0){
                System.out.println(zonas[i]);
            }
        }
    }
    @Override
    public String toString() {

        String mensaje = "";
        for (int i = 0; i < zonas.length; i++) {
            mensaje += zonas[i];
        }
        return mensaje;
    }
    public void ProgramaVenta(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(opcion!=3){
            do{
            System.out.println("1-Mostrar número de entradas libres\n"+
                                "2-Vender entradas\n" +
                                "3-Salir");
                opcion = sc.nextInt();
            }while(opcion<1 || opcion>3);
            String nombreZona="";
            int cantidad=0;
            switch (opcion){
                case 1:
                    entradasPorVender();
                    break;
                case 2:
                    sc.nextLine();
                    do{
                        System.out.println("Introduce nombre zona: ");
                        nombreZona = sc.nextLine();
                    }while(!existeZona(nombreZona));
                    do{
                        System.out.println("Introduce cantidad que desea comprar: ");
                        cantidad = sc.nextInt();
                    }while(cantidad<0);
                    vender(nombreZona,cantidad);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion no contemplada");
            }


        }

    }
}
