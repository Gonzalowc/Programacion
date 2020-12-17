package T3.Tarea3_Cadenas.PaginaWeb;

import java.util.Scanner;

public class Ej7_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String meses[] = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto",
                "Septiembre","Octubre","Noviembre","Diciembre"};
        do{
            System.out.println("Introduce un mes de forma numerica(1 - 12): ");
            mes = sc.nextInt();
            if(mes>=1 && mes<=12){
                System.out.println("El més "+meses[mes-1]+" tiene "+dias[mes-1]+" días");
            }
        }while(mes>=1 && mes<=12);


    }
}
