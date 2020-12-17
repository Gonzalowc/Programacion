package T3.Tarea1_Funciones;

public class EnClase_FuncionesActividad11 {
    public static void main(String[] args) {
        System.out.println(elevado(2,3));
        System.out.println(Math.pow(2,3));
    }

    public static double elevado( double a, int n){
        double potencia=a;
        for (int i = 1; i <n; i++) {
            potencia=potencia*a;
        }
        return potencia;
    }
}
