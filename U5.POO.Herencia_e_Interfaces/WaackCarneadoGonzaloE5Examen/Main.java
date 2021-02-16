package WaackCarneadoGonzaloE5Examen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Conductor manolo = new Conductor("Manolo","Vazquez Pepin","111111xx");
        Conductor pepe = new Conductor("Pepe","Martiz Galan","2222222xx");
        CamionCajas cc1 = new CamionCajas("333AAA",300,manolo);
        CamionCajas cc2 = new CamionCajas("444AAA",400,pepe);
        CamionPerchas cp1 = new CamionPerchas("333BBB",300,manolo);
        CamionPerchas cp2 = new CamionPerchas("444BBB",400,pepe);
        Prenda falda1 = new Prenda(15,"Falda Rosa",0.3);
        Prenda falda2 = new Prenda(17,"Falda Azul",0.4);
        Prenda falda3 = new Prenda(24,"Falda Negra",1);
        PrendaColgada vestido1 = new PrendaColgada("Vestido Rosa",14,1.4,1.3);
        PrendaColgada vestido2 = new PrendaColgada("Vestido Azul",18,1.4,1.4);
        PrendaColgada vestido3 = new PrendaColgada("Vestido Negro",25,1.4,2.4);
        Caja caja1 = new Caja();
        caja1.addPrenda(falda1);
        caja1.addPrenda(falda1);
        caja1.addPrenda(falda1);
        caja1.addPrenda(falda1);
        caja1.addPrenda(falda1);
        //esta ultima tiene que dar fallo al introducir
        caja1.addPrenda(falda1);
        Caja caja2 = new Caja();
        caja2.addPrenda(falda1);
        caja2.addPrenda(falda1);
        caja2.addPrenda(falda2);
        caja2.addPrenda(falda2);
        caja2.addPrenda(falda3);
        Caja caja3 = new Caja();
        caja3.addPrenda(falda1);
        caja3.addPrenda(falda2);
        caja3.addPrenda(falda3);
        caja3.addPrenda(falda1);
        caja3.addPrenda(falda2);
        //esta tiene que dar fallo por ser una prenda colgada
        caja3.addPrenda(vestido1);
        FARA empresa = new FARA();
        empresa.addVehiculo(cc2);
        empresa.addVehiculo(cc1);
        empresa.addVehiculo(cp2);
        empresa.addVehiculo(cp1);
        cc1.addCaja(caja1);
        cc1.addCaja(caja1);
        cc1.addCaja(caja2);
        cc1.addCaja(caja2);
        cc1.addCaja(caja2);
        cc1.addCaja(caja3);
        cc1.addCaja(caja3);
        cc1.addCaja(caja3);
        cp1.addPrendaColgada(vestido1);
        cp1.addPrendaColgada(vestido1);
        cp1.addPrendaColgada(vestido1);
        cp1.addPrendaColgada(vestido1);
        cp1.addPrendaColgada(vestido2);
        cp1.addPrendaColgada(vestido2);
        cp1.addPrendaColgada(vestido2);
        cp1.addPrendaColgada(vestido2);
        cp1.addPrendaColgada(vestido3);
        cp1.addPrendaColgada(vestido3);
        cp1.addPrendaColgada(vestido3);
        cp1.addPrendaColgada(vestido3);
        cp1.addPrendaColgada(vestido3);

        System.out.println(empresa);
        System.out.println("/ANTES/////////////////ORDENAR CAMION CAJAS POR CANTIDAD CAJAS/////////////////////////////////");
        empresa.mostrarCamionCajas();
        System.out.println("/DESPUES/////////////////ORDENAR CAMION CAJAS POR CANTIDAD CAJAS/////////////////////////////////");
        Arrays.sort(empresa.getCamionCajas());
        empresa.mostrarCamionCajas();
        System.out.println("/ANTES////////////////////////////ORDENAR CAMION CAJAS POR PESO ACTUAL//////////////////////");
        empresa.mostrarCamionCajas();
        System.out.println("/DESPUES////////////////////////////ORDENAR CAMION CAJAS POR PESO ACTUAL//////////////////////");
        Arrays.sort(empresa.getCamionCajas(), new CamionCajas.ordenarCamionCajaXPeso());
        empresa.mostrarCamionCajas();
        System.out.println("/ANTES////////////////////ORDENAR CAMION PERCHAS//////////////////////////////");
        empresa.mostrarCamionPerchas();
        System.out.println("/DESPUES////////////////////ORDENAR CAMION PERCHAS//////////////////////////////");
        Arrays.sort(empresa.getCamionPerchas());
        empresa.mostrarCamionPerchas();
        System.out.println("//////////////////////TODO DE NUEVO/////////////////////////////");

        caja1.deletePrenda(falda1);
        cc1.deleteCaja(caja1);
        cp1.deletePrendaColgada(vestido2);

        System.out.println(empresa);
        cc1.descargar();
        cc2.descargar();
        cp1.descargar();
        cp2.descargar();
    }

}
