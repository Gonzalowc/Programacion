package T3.Libro;

import java.util.Arrays;
import java.util.Scanner;

public class Pag153_Ej5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cajaJ1=0, cajaJ2=0, pos, piedras, piedrasextra, turno=1;
        int[][] wagi = {
                        {4,4,4,4,4,4},
                        {4,4,4,4,4,4}
                        };

        while(cajaJ1<25 || cajaJ2<25){
            //Jugador 1
            if(turno==1){
                for (int i = 0; i < wagi.length; i++){
                    if(i==0){
                        System.out.println(" __                      __");
                        System.out.printf("|J1| %18s |%2d|\n",Arrays.toString(wagi[i]), cajaJ2);
                    }
                    if(i==1){
                        System.out.printf("|%2d| %18s |J2|\n",cajaJ1,Arrays.toString(wagi[i]));
                        System.out.println(" --                      --");
                    }
                }
                do{
                    System.out.println("Jugador1: ¿Que cuenco quiere mover?");
                    pos = sc.nextInt();
                }while(pos<1 || pos>6 || wagi[0][pos-1]<=1);
                piedras = wagi[0][pos-1];
                for (int i = pos-1; i >=0 ; i--) {
                    if(i==pos-1){
                        wagi[0][i]= 0;
                    }else{
                        wagi[0][i]+=1;
                        piedras--;
                    }
                }
                if(piedras>=1){
                    cajaJ1++;
                    piedras--;
                    if(piedras==0){
                        turno=1;
                    }else{
                        turno=2;
                    }
                }else{
                    turno=2;
                }
                if(piedras>6){
                    piedrasextra = piedras-6;
                    piedras=6;
                }else{
                    piedrasextra=0;
                }
                if(piedras>0){
                    for (int i = 0; i < piedras; i++) {
                        wagi[1][i]+=1;
                    }
                    if(wagi[1][piedras-1]==2 ||wagi[1][piedras-1]==3){
                        for (int j = piedras-1; j >=0 ; j--) {
                            if(wagi[1][j]==2 || wagi[1][j]==3){
                                cajaJ1+=wagi[1][j];
                                wagi[1][j]=0;
                            }else{
                                break;
                            }
                        }
                    }
                    if(piedrasextra>0){
                        for (int i = 5; i >5-piedrasextra ; i--){
                            if(i<=pos-1 && i>0){
                                wagi[0][i-1]+=1;
                            }else{
                                wagi[0][i]+=1;
                            }
                        }
                    }
                }
            }
            //Fin Jugador 1
            if(turno==2){
            for (int i = 0; i < wagi.length; i++){
                if(i==0){
                    System.out.println(" __                      __");
                    System.out.printf("|J1| %18s |%2d|\n",Arrays.toString(wagi[i]), cajaJ2);
                }
                if(i==1){
                    System.out.printf("|%2d| %18s |J2|\n",cajaJ1,Arrays.toString(wagi[i]));
                    System.out.println(" --                      --");
                }
            }
            //Inicio Jugador 2
                do{
                    System.out.println("Jugador2: ¿Que cuenco quiere mover?");
                    pos = sc.nextInt();
                }while(pos<1 || pos>6 || wagi[1][pos-1]<=1);
                piedras = wagi[1][pos-1];
                for (int i = pos-1; i<6 ; i++) {
                    if(i==pos-1){
                        wagi[1][i]= 0;
                    }else{
                        wagi[1][i]+=1;
                        piedras--;
                    }
                }
                if(piedras>=1){
                    cajaJ2++;
                    piedras--;
                    if(piedras==0){
                        turno=2;
                    }else{
                        turno=1;
                    }
                }else{
                    turno=1;
                }
                if(piedras>6){
                    piedrasextra = piedras-6;
                    piedras=6;
                }else{
                    piedrasextra=0;
                }
                if(piedras>=0 && piedras<=5  ){
                    for (int i = 5; i > 6-piedras; i--){
                        wagi[0][i]+=1;
                        if(wagi[0][6-piedras]==2 || wagi[0][6-piedras]==3 ){
                            for (int j = 5-piedras; j <=5 ; j++) {
                                if(wagi[0][j]==2 || wagi[0][j]==3){
                                    cajaJ2+=wagi[0][j];
                                    wagi[0][j]=0;
                                }else{
                                    break;
                                }
                            }
                        }
                    }
                    if(piedrasextra>0){
                        for (int i = 0; i < piedrasextra ; i--){
                            if(i >=pos-1){
                                wagi[1][i+1]+=1;
                            }else{
                                wagi[1][i]+=1;
                            }
                        }
                    }
                }
            }
            //Fin Jugador 2
        }
    }
}
