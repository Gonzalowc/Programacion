package Libro2.Fraccion;

public class Fraccion {

    double numerador;
    double denominador;

    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public void invierte(){
        double aux = denominador;

        this.denominador = this.numerador;
        this.numerador = aux;
    }
    public void simplifica(){
        int contador=2;
        while(this.denominador%contador!=0 && this.numerador%contador!=0){
            contador++;
            if(contador>denominador || contador>numerador){
                break;
            }
        }
        if(contador>denominador || contador>numerador){
            System.out.println("No se puede simplificar");
        }else{
            this.denominador=this.denominador/contador;
            this.numerador=this.numerador/contador;
            simplifica();
        }

    }
    public Fraccion multiplica(Fraccion f2){
        Fraccion aux = new Fraccion(0,0);
        aux.setNumerador(this.numerador*f2.getNumerador());
        aux.setDenominador(this.denominador*f2.getDenominador());
        aux.simplifica();
        return aux;
    }
    public Fraccion Divide (Fraccion f2){
        Fraccion aux = new Fraccion(0,0);
        aux.setDenominador(numerador*f2.getDenominador());
        aux.setNumerador(denominador*f2.getNumerador());
        aux.simplifica();
        return aux;
    }
}
