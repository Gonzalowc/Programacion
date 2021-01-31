package CuentaCorriente;

import Banco.Banco;

public class main {
    public static void main(String[] args) {
        CuentaCorriente c1,c2,c3;
        Banco b1,b2;

        b1 = new Banco("International Java Bank");
        b2 = new Banco("Caja de ahorros de Do-While",10.6,"C/Larga S/N");

        c1 = new CuentaCorriente("Pepita","12345678-A",b1);
        c2 = new CuentaCorriente("Ana","98765432-Z",b1);
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3 = new CuentaCorriente("Sancho","1122333-B");
        c3.mostrarInfo();
        c3.cambiarBanco(b2);
        c3.mostrarInfo();
    }

}
