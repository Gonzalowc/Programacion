package T3.Tarea4_Tablas;

public class Ej8 {
    public static void main(String[] args) {
        int[][] suma = new int[5][5];
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                suma[i][j] = i+j;
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }
    }
}
