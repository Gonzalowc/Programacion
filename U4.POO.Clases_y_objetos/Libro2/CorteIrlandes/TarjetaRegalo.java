package Libro2.CorteIrlandes;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TarjetaRegalo {
    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println("t1 "+t1);
        System.out.println("t2 "+t2);
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);
        System.out.println("t1 "+t1);
        System.out.println("t2 "+t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println("t1 "+t1);
        System.out.println("t2 "+t2);
        System.out.println("t3 "+t3);
    }
    private static String[] codigosUsados = new String[0];
    String codigo;
    double saldo;

    public TarjetaRegalo(double saldo) {

        String cadena="";
        do{
            String num = Integer.toString((int)(Math.random()*100000));
            for (int i = 0; i < 5-num.length(); i++) {
                cadena+="0";
            }
            cadena+=num;
        }while(existeCodigo(cadena));
        codigosUsados = Arrays.copyOf(codigosUsados,codigosUsados.length+1);
        codigosUsados[codigosUsados.length-1] = cadena;
        this.codigo = cadena;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean existeCodigo(String codigo){
        for (int i = 0; i < codigosUsados.length; i++) {
            if(codigosUsados[i].equals(codigo)){
                return true;
            }
        }
        return false;
    }
    public void gasta(double cantidad){
        if(saldo-cantidad>=0){
            this.saldo-=cantidad;
        }else{
            System.out.println("No tiene suficiente saldo para gastar "+cantidad+"€");
        }
    }
    private void vaciarTargeta(){
        this.saldo = 0;
    }
    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo aux = new TarjetaRegalo(this.getSaldo()+t.getSaldo());
        this.vaciarTargeta();
        t.vaciarTargeta();
        return aux;
    }
    private String formatoSaldo(double saldo){
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(saldo);
        return format;
    }

    @Override
    public String toString() {

        return "Tarjeta nº " + codigo + " - " +
                "saldo " + formatoSaldo(saldo) +"€ ";
    }

}
