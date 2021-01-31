package Libro2.CuentaCorriente;

public class CuentaCorriente {
    String numeroCuenta;
    double saldo;

    public CuentaCorriente() {

        this.numeroCuenta = generarCodigo(10);
        this.saldo = 0;
    }
    public CuentaCorriente(double saldo){
        this();
        setSaldo(saldo);
    }
    private  String generarCodigo(int longitud){
        String numeroCuenta ="";
        for (int i = 0; i < longitud; i++) {
            numeroCuenta+=Integer.toString((int)(Math.random()*(10)));
        }
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
