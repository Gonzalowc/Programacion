package T3.Tarea1_Funciones;

public class EnClase_FuncionesActividad6 {
    public static void main(String[] args) {

    }
    public static boolean esVocal(char letra){
        String cad = Character.toString(letra);
        cad = cad.toUpperCase();
        letra = cad.charAt(0);
        if( letra=='A' ||letra=='E' ||letra=='I' ||letra=='O' ||letra=='U'){
            return true;
        }else{
            return false;
        }
    }
}
