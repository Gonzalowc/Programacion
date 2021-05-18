package jdbc;

import conector.ConexionDB;

public class Main__Transacciones {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1234,"Gonzalo","Waack","Gonzalo","667788992","Calle Transaccion, 10","Sevilla","Spain");
        Payment pago1 = new Payment(1234,"abcd","2021-05-18",135.99);
        Payment pago2 = new Payment(1234,"check","2021-02-25",99.95);
        Transacciones.insertarCliente(cliente,pago1,pago2);
        ConexionDB.close();
    }
}
