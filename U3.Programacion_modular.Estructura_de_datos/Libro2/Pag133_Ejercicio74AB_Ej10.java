package T3.Libro2;

import java.util.Arrays;
import java.util.Scanner;

public class Pag133_Ejercicio74AB_Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[3][3];
        mostrarTablero(tablero);
        int I,J;
        boolean ganador1=false, ganador2=false;
        while(!ganador1 && !ganador2 && espaciosEnTablero(tablero)){
            do{
                System.out.println("Jugador 1: Posición altura: ");
                I =sc.nextInt();
                System.out.println("Jugador 1: Posición anchura: ");
                J =sc.nextInt();
                if((I<0 || I>2 || J<0 || J>2) ||tablero[I][J]!=null){
                    System.out.println("LA CASILLA YA ESTÁ OCUPADA");
                    mostrarTablero(tablero);
                }

            }while((I<0 || I>2 || J<0 || J>2) || tablero[I][J]!=null);
            tablero[I][J]=" X  ";
            mostrarTablero(tablero);
            if(haGanado(tablero," X  ")){
                ganador1=true;
                break;
            }
            do{
                System.out.println("Jugador 2: Posición altura: ");
                I =sc.nextInt();
                System.out.println("Jugador 2: Posición anchura: ");
                J =sc.nextInt();
                if((I<0 || I>2 || J<0 || J>2) ||tablero[I][J]!=null){
                    System.out.println("LA CASILLA YA ESTÁ OCUPADA");
                    mostrarTablero(tablero);
                }
            }while((I<0 || I>2 || J<0 || J>2) || tablero[I][J]!=null);
            tablero[I][J]=" O  ";
            mostrarTablero(tablero);
            if(haGanado(tablero," O  ")){
                ganador2=true;
                break;
            }
        }

        if(ganador1){
            System.out.println("Has ganado Jugador 1!!");
        }else{
            System.out.println("Has ganado Jugador 2!!");
        }

    }

    public static boolean haGanado(String[][] tablero, String ficha) {
        int contDia=0;int contDiaCon=0;
        int cont=0;
        int cont2=0;
        for (int i = 0; i < tablero.length; i++) {
            cont=0;
            cont2=0;
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j]!=null){
                    if (i == j && tablero[i][j].equals(ficha)) {
                        contDia++;
                    }
                    if (i + j == tablero.length-1 && tablero[i][j].equals(ficha)) {
                        contDiaCon++;
                    }
                    if (tablero[i][j].equals(ficha)) {
                        cont++;
                    }
                }
                if(tablero[j][i]!=null){
                     if (tablero[j][i].equals(ficha)) {
                        cont2++;
                    }
                }
            }
            if(cont==3){
                return true;
            }
            if(cont2==3){
                return true;
            }
            if (contDia==3){
                return true;
            }
            if(contDiaCon==3){
                return true;
            }
        }

        return false;
    }

    public static void mostrarTablero(String[][] tablero){
        System.out.printf("   %-5s  %-5s %-5s","0","1","2");
        System.out.println();
        for (int i = 0; i <tablero.length ; i++) {
            System.out.println(i+Arrays.toString(tablero[i]));
            System.out.println();
        }
    }
    public static boolean espaciosEnTablero(String[][] tablero){
        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if(tablero[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }

}
