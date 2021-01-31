package Libro2.Caballo;

public class Caballo {
    public static void main(String[] args) {
        Caballo felipe = new Caballo();
        felipe.paso();
        felipe.trote(35);
    }

    Sexo sexo;
    int velocidadMax;
    Color color;

    Caballo(){
        sexo = Sexo.MACHO;
        velocidadMax = 40;
        color = Color.MARRON;
    }
    Caballo(Sexo s){
        if(s.equals(Sexo.HEMBRA)){
            color = Color.BLANCO;
            velocidadMax = 35;
        }else{
            color = Color.MARRON;
            velocidadMax = 40;
        }
        sexo = s;
    }
    Caballo(Sexo s, Color c){
        if(s.equals(Sexo.HEMBRA)){
            velocidadMax = 35;
        }else{
            velocidadMax = 40;
        }
        sexo = s;
        color = c;
    }
    Caballo(Sexo s , Color c, int velocidad){
        sexo = s;
        color = c;
        if(velocidad>=0){
            velocidadMax = velocidad;
        }else{
            velocidadMax = 5;
        }
    }

    public void paso(){
        System.out.println("Paso: " + (int)(velocidadMax*0.2)+" Km/h");
    }
    public void trote(int porcentaje){
        if(porcentaje>20 && porcentaje<50){
            System.out.println("Trote: "+ (int)(velocidadMax*((double)porcentaje/100))+" Km/h");
        }else if(porcentaje>=50 && porcentaje<=100){
            galope(porcentaje);
        }else{
            paso();
        }
    }
    public void galope(int porcentaje){
        if(porcentaje>=50 && porcentaje<=100){
            System.out.println("Galope: "+ (int)(velocidadMax*((double)porcentaje/100))+" Km/h");
        }else if(porcentaje>20 && porcentaje<50){
            trote(porcentaje);
        }else{
            paso();
        }
    }


}
