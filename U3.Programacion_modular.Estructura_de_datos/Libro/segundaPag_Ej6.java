package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class segundaPag_Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] meses = {{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"},
                {"31 dias","28 dias","31 dias","30 dias","31 dias","30 dias","31 dias","31 dias","30 dias","31 dias","30 dias","31 dias"}};
        String mes;
        do{
            System.out.println("Que mes quiere comprobar");
            mes = sc.nextLine();
        }while(!esMes(mes));
        for (int i = 0; i < meses[0].length; i++) {
            if(meses[0][i].equals(mes)){
                System.out.println("El mes '"+meses[0][i]+"' tiene "+meses[1][i]);
                break;
            }
        }

    }
    public static boolean esMes(String mes){
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for (int i = 0; i < meses.length; i++) {
            if(meses[i].equals(mes)){
                return true;
            }
        }
        return false;
    }
}
