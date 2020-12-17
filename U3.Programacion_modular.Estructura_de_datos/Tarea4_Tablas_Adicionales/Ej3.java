package T3.Tarea4_Tablas_Adicionales;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant, mesaDisponible;
        int[] mesas = {0,0,0,0,0,0,0,0,0,0};

        do{
            mesaDisponible=-1;
            System.out.println("\n¿Cuantos son?");
            cant = sc.nextInt();
            if(cant>=1 && cant<=4){


                //Buscar mesa vacía
                for (int i = 0; i < mesas.length; i++) {
                    if (mesas[i]==0){
                        mesaDisponible=i;
                        break;
                    }
                }
                if(mesaDisponible!=-1){
                    if(cant>4){
                        System.out.println("No podemos aceptar grupos mayor que 4");
                    }else{
                        mesas[mesaDisponible]=cant;
                    }

                }else{
                    for (int i = 0; i <mesas.length ; i++) {
                        if(mesas[i]+cant<=4){
                            mesas[i] += cant;
                            break;
                        }else{
                            if(i+1==mesas.length){
                                System.out.println("No hay mesa disponible");
                            }
                        }
                    }
                }
                //Pintar
                System.out.print("| Mesa nº ");
                for (int i = 0; i <mesas.length ; i++) {
                    System.out.print("| "+i+" | ");
                }
                System.out.println();
                System.out.print("|Ocupación");
                for (int i = 0; i < mesas.length; i++) {
                    System.out.print("| "+mesas[i]+" | ");
                }
                //Fin pintar
            }else if( cant>4){
                System.out.println("Lo siento, no admitimos grupos de "+ cant+" haga grupos de 4 personas maximo e intente de nuevo");
            }
        }while(cant!=-1);

    }
}
