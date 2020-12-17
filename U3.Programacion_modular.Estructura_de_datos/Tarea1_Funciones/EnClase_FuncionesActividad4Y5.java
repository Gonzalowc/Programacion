package T3.Tarea1_Funciones;

public class EnClase_FuncionesActividad4Y5 {
    public static void main(String[] args) {
        System.out.println(Mayor(1,2,3));
    }
    public static int Mayor(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static int Mayor(int a, int b, int c){
        if(Mayor(a,b)>c){
            return Mayor(a,b);
        }else{
            return c;
        }
    }
}
