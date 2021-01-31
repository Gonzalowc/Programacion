package EFerroviaria.Maquinaria;

import EFerroviaria.Personal.Maquinista;
import EFerroviaria.Personal.Mecanicos;

public class Main {
    public static void main(String[] args) {
        Mecanicos m1 = new Mecanicos("Gonzalo WC","666778899","Electrónica");
        Locomotora l = new Locomotora("1234567ab",7000,2006,m1);
        Maquinista maq = new Maquinista("Felipe","123345688A",2300,"Oficial");
        Tren t = new Tren(l,maq,5);

        t.unirVagones(15000,6000,"Peligrosa");
        t.unirVagones(15000,6000,"Peligrosa");


        t.estadoTren();
    }
}
