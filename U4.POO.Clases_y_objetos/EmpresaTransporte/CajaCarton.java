package EmpresaTransporte;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CajaCarton extends Caja {
    public static void main(String[] args) {
        Destinatario nuevo = new Destinatario("gonzalo","malaga,83");
        Destinatario nuevo2 = new Destinatario("gonzalo","málaga,83");
        CajaCarton cc = new CajaCarton(60,60,30,nuevo);
        CajaCarton cc2 = new CajaCarton(7,7,7,nuevo2);
        Caja nuevo3 = new Caja(7,7,7,Unidades.CM);
        nuevo3.addDestinatario(nuevo2);
        System.out.println(cc);
        System.out.println(cc2);
        System.out.println(nuevo3);
    }

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidades.CM);
    }

    public CajaCarton(int ancho, int alto, int fondo, Destinatario cliente) {
        super(ancho, alto, fondo, Unidades.CM, cliente);
    }
    public double superficieTotalEnM2(){
        double caras = alto*ancho*2;
        caras+= alto*fondo*2;
        caras+=ancho*fondo*2;
        caras=caras/1000000;
        return caras;
    }

    @Override
    public double getVolumen(){
        return super.getVolumen()*0.8;
    }
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String etiqueta(){

        String etiqueta = "";
        String marcoHor = "";
        if (!cliente.getDireccion().equals("") || !cliente.getNombreCompleto().equals("")) {
            for (int i = 0; i < 36; i++) {
                marcoHor += "_";
            }
            /*int hash=0;
            for (int i = 0; i < cliente.getNombreCompleto().length(); i++) {
                hash+= cliente.getNombreCompleto().charAt(i);
            }
            for (int i = 0; i < cliente.getDireccion().length(); i++) {
                hash+= cliente.getDireccion().charAt(i);
            }*/

            etiqueta += marcoHor + "\n\n" + "  " + getMD5(cliente.getDireccion()+cliente.getNombreCompleto())/*hash*/ + "\n\n" + marcoHor;
        } else {
            marcoHor = "_________________________________";
            etiqueta += marcoHor + "\n\n" + "  " + "###Destinatario sin añadir###" + "\n\n" + marcoHor;
        }
        return etiqueta;
    }
}
