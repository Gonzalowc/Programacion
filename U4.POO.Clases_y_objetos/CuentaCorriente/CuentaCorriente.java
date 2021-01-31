package CuentaCorriente;
import Banco.*;

public class CuentaCorriente {
    private double saldo;
    private final double limDescu;
    public String nombre;
    protected String DNI;
    Banco banco;

    CuentaCorriente(String nombre,String DNI ){
        this.nombre = nombre;
        this.DNI = DNI;
        saldo = 0;
        limDescu = -50;

    }
    CuentaCorriente(double saldo){
        limDescu = 0;
        this.saldo = saldo;
        nombre = "";
        DNI = "";
    }
    CuentaCorriente(double saldoInicial, double Limit, String DNI){
        this.saldo = saldoInicial;
        this.limDescu = Limit;
        this.DNI = DNI;
        this.nombre = "";
    }
    CuentaCorriente(String nombre, String DNI,Banco banco){
        this(0,-50,DNI);
        this.nombre = nombre;
        this.banco = banco;
    }
    void cambiarBanco(Banco banco){
        this.banco = banco;
    }
    void mostrarInfo(){
        System.out.println("Información del banco: ");
        if(banco ==null){
            System.out.println("Cuenta no asociada a ningun banco");
        }else{
            banco.mostrarInfo();
        }
        System.out.println("Información de la cuenta: ");
        System.out.println("Titular: "+nombre);
        System.out.println("DNI: "+DNI);
        System.out.println("Saldo: "+saldo);
        System.out.println("Límite descubierto: "+limDescu);
    }
    public boolean sacarDinero(double cantidad){
        if(saldo-cantidad>=limDescu){
            saldo-=cantidad;
            System.out.println("Se ha realizado la operación");
            return true;
        }else{
            System.out.println("No se ha podido realizar la operación");
            return false;
        }
    }
    public void ingresarDinero(double cantidad){
        saldo+=cantidad;
    }
    private void cambiarNombreBanco(Banco banco){
        this.banco = banco;
    }
}
