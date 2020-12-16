package T3.Libro2;
import java.util.Arrays;
public class Pag133_Ejercicio74AB_Ej13 {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estatura = new int[4][10];
        int min=0,max=0, media=0;
        for (int i = 0; i <estatura.length ; i++) {
            for (int j = 0; j < estatura[0].length; j++) {
                estatura[i][j] = (int)((Math.random()*71)+140);
            }
        }
        System.out.printf("%62s %3s %3s %3s","","MED","MIN","MAX");
        System.out.println();
        for (int i = 0; i < estatura.length; i++) {

            for (int j = 0; j < estatura[0].length; j++) {
                if(j==0){
                    min = estatura[i][j];
                    max = estatura[i][j];
                    media=estatura[i][j];
                }else{
                    media+=estatura[i][j];
                    if(min>estatura[i][j]){
                        min = estatura[i][j];
                    }
                    if(max<estatura[i][j]){
                        max = estatura[i][j];
                    }
                }

            }
            media = media/estatura[0].length;
            System.out.printf("%9s:"+Arrays.toString(estatura[i])+" | %3d %3d %3d", pais[i],media,min,max);
            System.out.println();
        }
    }
}