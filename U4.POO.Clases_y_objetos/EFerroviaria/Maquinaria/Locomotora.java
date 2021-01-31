package EFerroviaria.Maquinaria;

import EFerroviaria.Personal.Mecanicos;

public class Locomotora {
    String matricula;
    double potenciaMotor;
    int YFabricacion;
    private Mecanicos m;

    public Locomotora(String matricula, int potenciaMotor, int añoFabricacion, Mecanicos m) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.YFabricacion = añoFabricacion;
        this.m = m;
    }
    public void infoLoco(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Potencia del motor: "+this.potenciaMotor);
        System.out.println("Año de fabricación: "+YFabricacion);
        System.out.println();
        m.infoMecanico();
    }

}
